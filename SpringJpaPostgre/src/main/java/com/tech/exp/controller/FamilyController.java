package com.tech.exp.controller;

import com.tech.exp.entity.Babies;
import com.tech.exp.service.FamilyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FamilyController {

	@Autowired
	private FamilyInterface familyInterface;
	@GetMapping(value="/get-babies")
	public Babies getbabies() {
		return familyInterface.getBabies();
	}

	@PostMapping (value="/add-baby/{id}/{name}")
	public void addBabies(@PathVariable("id") int age, @PathVariable("name") String name) {

		familyInterface.addBaby(age,name);
	}
	

}
