package com.dojo_ninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo_ninjas.models.Dojo;
import com.dojo_ninjas.models.Ninja;
@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	 List<Dojo>findAll();
}
 