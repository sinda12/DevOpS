package com.bookstore.bookstore.controller;




import java.util.List;

import com.bookstore.bookstore.model.Employee;
import com.bookstore.bookstore.repository.EmployeeRepository;
import com.bookstore.bookstore.service.EmployeeService;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService userService ;
	@Autowired
	private EmployeeRepository userR;
	
	@GetMapping("list-user")
	public List<Employee> listTasks() {

		return userR.findAll();
	}
	
	
	@PostMapping("edit-user")
	public String editTasks(Model model , Employee user) {
		userService.save(user);

		return "save success";

	}
	@PutMapping(value="edit-user/{id}") 
	public String editUser(@PathVariable Long id, @RequestBody Employee user) {
		Employee updatedUser= userService.findOne(id).get();
	updatedUser.setEmail(user.getEmail());
	updatedUser.setNom(user.getNom());
	updatedUser.setPrenom(user.getEmail());
	updatedUser.setActif(user.isActif());
	userService.save(updatedUser);
	return "updated";
	}
	@DeleteMapping("delete-user/{id}")
	public String deleteUser(@PathVariable Long id) {
		
		 userService.delete(id);

		 return "Deleted success";
		 
	}
	
	
	

}
