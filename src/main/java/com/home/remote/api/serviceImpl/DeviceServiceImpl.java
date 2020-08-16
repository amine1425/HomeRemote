package com.home.remote.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.remote.api.entities.Device;
import com.home.remote.api.repository.DeviceRepository;
import com.home.remote.api.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	DeviceRepository DeviceRepository;
	
	@Override
	public void deleteDevice(Device device) {
		// TODO Auto-generated method stub
		DeviceRepository.delete(device);
	}

	@Override
	public List<Device> findAllDevice() {
		// TODO Auto-generated method stub
		return DeviceRepository.findAll();
	}

	@Override
	public Device findOneDevice(Long deviceId) {
		// TODO Auto-generated method stub
		return DeviceRepository.findOneDeviceById(deviceId);
	}



	@Override
	public Device saveDevice(Device device) {
		// TODO Auto-generated method stub
		return DeviceRepository.save(device);
	}

}
