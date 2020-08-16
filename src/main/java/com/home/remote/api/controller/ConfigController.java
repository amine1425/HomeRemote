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
import com.home.remote.api.entities.Config;
import com.home.remote.api.service.ConfigService;

@RequestMapping
@RestController
public class ConfigController {

	@Autowired
	private ConfigService  ConfigService;

	@JsonIgnore
	@RequestMapping(value = "/Config/ConfigManager", method = RequestMethod.GET)
	public ResponseEntity<List<Config>> findAll() {
		List<Config>cat = ConfigService.findAllConfig();
		return ResponseEntity.status(HttpStatus.OK).body(cat);
	}

	@RequestMapping(value = "/Config/ConfigById/{id}", method = RequestMethod.GET)
	public Config getConfigById(@PathVariable("id") Long id) {
		return ConfigService.findOneConfig(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Config/deleteConfig")
	public void deleteConfig(@RequestBody Config Config) {
		ConfigService.deleteConfig(Config);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Config/saveConfig")
	public void saveConfig(@RequestBody Config Config) {
		ConfigService.saveConfig(Config);

	}

}
