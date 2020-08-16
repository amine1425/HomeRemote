package com.home.remote.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.remote.api.entities.Config;
import com.home.remote.api.repository.ConfigRepository;
import com.home.remote.api.service.ConfigService;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	ConfigRepository ConfigRepository;
	
	@Override
	public void deleteConfig(Config config) {
		// TODO Auto-generated method stub
		ConfigRepository.delete(config);
	}

	@Override
	public List<Config> findAllConfig() {
		// TODO Auto-generated method stub
		return ConfigRepository.findAll();
	}

	@Override
	public Config findOneConfig(Long configId) {
		// TODO Auto-generated method stub
		return ConfigRepository.findOneConfigById(configId);
	}

	@Override
	public Config saveConfig(Config config) {
		// TODO Auto-generated method stub
		return ConfigRepository.save(config);
	}

}
