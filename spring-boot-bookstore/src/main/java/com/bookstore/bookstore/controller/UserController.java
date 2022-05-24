package com.bookstore.bookstore.controller;




import java.util.List;

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

import com.bookstore.bookstore.model.Profile;
import com.bookstore.bookstore.repository.UserRepository;
import com.bookstore.bookstore.service.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService userService ;
	@Autowired
	private UserRepository userR;
	
	@GetMapping("list-user")
	public List<Profile> listTasks() {
		return userR.findAll();
			
		
	}
	
	
	@PostMapping("edit-user")
	public String editTasks(Model model , Profile user) {
		userService.save(user);
		return "save sucess";
	}
	@PutMapping(value="edit-user/{id}") 
	public String editUser(@PathVariable Long id, @RequestBody Profile user) {
	Profile updatedUser= userService.findOne(id).get();
	updatedUser.setEmail(user.getEmail());
	updatedUser.setName(user.getName());
	updatedUser.setPassword(user.getPassword());
	updatedUser.setLast_name(user.getLast_name());
	updatedUser.setTel(user.getTel());
	userService.save(updatedUser);
	return "updated";
	}
	@DeleteMapping("delete-user/{id}")
	public String deleteUser(@PathVariable Long id) {
		
		 userService.delete(id);
		return "delete succ" ;
		 
	}
	
	
	

}
