package com.dojo_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojo_ninjas.models.Dojo;
import com.dojo_ninjas.models.Ninja;
import com.dojo_ninjas.repositories.DojoRepository;
import com.dojo_ninjas.repositories.NinjaRepository;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

@Service
public class DojoNinjaServices {
   private DojoRepository dojoRepo;
   private NinjaRepository ninjaRepo;
   
   public DojoNinjaServices(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
	super();
	this.dojoRepo = dojoRepo;
	this.ninjaRepo = ninjaRepo;
}
   //make dojo
    public Dojo create(Dojo newDojo) {
    	return dojoRepo.save(newDojo);
    }
   //make a stundent/ninja
    public Ninja create(Ninja newNinja) {
    	return ninjaRepo.save(newNinja);
    }
   //display dojo
    public List<Dojo> getAllDojos(){
    	return( List<Dojo>)dojoRepo.findAll();
    }
   //display/student/ninja
    public List<Ninja>getAllNinjas(){
    	return ( List<Ninja>)ninjaRepo.findAll();//return dojoRepo.findAll() this also works
    	
    }
   //dispaly one Dojo
    public Dojo getDojo(Long id) {
    	Optional<Dojo>optionalDojo=this.dojoRepo.findById(id);
    	if(optionalDojo.isPresent()) {
    		return optionalDojo.get();
    	}else {
    		return null;
    	}
    }
    
   
}
