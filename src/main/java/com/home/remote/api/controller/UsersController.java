package com.home.remote.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.home.remote.api.entities.Users;
import com.home.remote.api.service.UsersService;

@RequestMapping
@RestController
public class UsersController {

	@Autowired
	private UsersService  UsersService;

	@JsonIgnore
	@RequestMapping(value = "/Users/UsersManager", method = RequestMethod.GET)
	public ResponseEntity<List<Users>> findAll() {
		List<Users>cat = UsersService.findAllUsers();
		return ResponseEntity.status(HttpStatus.OK).body(cat);
	}

	@RequestMapping(value = "/Users/UsersById/{id}", method = RequestMethod.GET)
	public Users getUsersById(@PathVariable("id") Long id) {
		return UsersService.findOneUsers(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Users/deleteUsers")
	public void deleteUsers(@RequestBody Users Users) {
		UsersService.deleteUsers(Users);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Users/saveUsers")
	public void saveUsers(@RequestBody Users Users) {
		UsersService.saveUsers(Users);

	}
}
