package com.example.demo.EController;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repo.EmployeeRepo;

@RestController
public class EmployeeController {

	// Has-A Relencation In The Repo Class Use The Autowired
	@Autowired
	private EmployeeRepo repo;

	@PostMapping("/savedata")
	public String SaveData(@RequestBody EmployeeEntity ent) {

		repo.save(ent);

		return "The Data Are Saved Sucess....!!";

	}
}
