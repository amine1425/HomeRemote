package com.home.remote.api.service;

import java.util.List;

import com.home.remote.api.entities.Device;

public interface DeviceService {

	
	void deleteDevice(Device device);

	List<Device> findAllDevice();

	Device findOneDevice(Long deviceId);

	Device saveConfig(Device device);
}
