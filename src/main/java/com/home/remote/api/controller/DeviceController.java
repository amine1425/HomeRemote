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
import com.home.remote.api.entities.Device;
import com.home.remote.api.service.DeviceService;

@RequestMapping
@RestController
public class DeviceController {

	@Autowired
	private DeviceService  DeviceService;

	@JsonIgnore
	@RequestMapping(value = "/Device/DeviceManager", method = RequestMethod.GET)
	public ResponseEntity<List<Device>> findAll() {
		List<Device>cat = DeviceService.findAllDevice();
		return ResponseEntity.status(HttpStatus.OK).body(cat);
	}

	@RequestMapping(value = "/Device/DeviceById/{id}", method = RequestMethod.GET)
	public Device getDeviceById(@PathVariable("id") Long id) {
		return DeviceService.findOneDevice(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Device/deleteDevice")
	public void deleteDevice(@RequestBody Device Device) {
		DeviceService.deleteDevice(Device);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Device/saveDevice")
	public void saveDevice(@RequestBody Device Device) {
		DeviceService.saveDevice(Device);

	}

}
