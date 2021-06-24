package com.dojo_ninjas.controllers;

import java.lang.ProcessBuilder.Redirect;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo_ninjas.models.Dojo;
import com.dojo_ninjas.models.Ninja;
import com.dojo_ninjas.services.DojoNinjaServices;

//import sun.jvm.hotspot.ui.action.ShowAction;

@Controller
public class HomeController {
 private DojoNinjaServices dnService;

public HomeController(DojoNinjaServices dnService) {
	super();
	this.dnService = dnService;
}

// form to show all Dojos
@GetMapping("/")
public String index( Model model) {
	 model.addAttribute("allDojos",dnService.getAllDojos());
	 return "index.jsp";
 }
// we can show one ninja and dojo s student
 @GetMapping("/showDojo/{id}")
 public String showDojo(@PathVariable("id") Long id,Model model) {
	 Dojo myDojo = this.dnService.getDojo(id);
	 model.addAttribute("thisDojo",myDojo);
	 return "oneDo.jsp";
 }
 
// this is the jsp to return  the form to create dojo
 @GetMapping("/newDojo")
 public String dojo(@ModelAttribute("addDojo")Dojo dojo) {
	 return "newDojo.jsp";
 }
// this is where we crate Dojo
 @PostMapping("/dojos")
 public String makeJojo(@Valid @ModelAttribute("addDojo")Dojo dojo,BindingResult result, Model model) {
	 if(result.hasErrors()) {
		 System.out.println(result.getAllErrors());
	 }else {
		 dnService.create(dojo);
	 }
	 return "redirect:/";
 }
//  this is jps to retun the form to create ninja
 @GetMapping("/ninjas")
 public String ninja(@ModelAttribute("addNinja")Ninja ninja,Model model){
	 model.addAttribute("allDojos",dnService.getAllDojos());
	 return"newNinja.jsp";
 }
 
 
// this is where we create Ninja
 @PostMapping("/ninjas")
 public String makeNinja(@Valid @ModelAttribute("addNinja")Ninja ninja,BindingResult result, Model model) {
	 if(result.hasErrors()) {
		 System.out.println(result.getAllErrors());
	 }else {
		 dnService.create(ninja);
	 }
	 return "redirect:/";
 }
 
 
}
