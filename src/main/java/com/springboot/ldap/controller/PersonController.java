package com.springboot.ldap.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ldap.entity.Person;
import com.springboot.ldap.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonRepository repository;
	
	@PostMapping("/create")
	public Person create(@RequestBody Person person) {
		return repository.create(person.getUsername());
	}
	
	@GetMapping("/getPerson/{username}")
	public Person getPerson(@PathVariable("username") String username){
		return repository.findByUsername(username);
	}
}
