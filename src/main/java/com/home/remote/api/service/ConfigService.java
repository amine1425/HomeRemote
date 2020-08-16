package com.home.remote.api.service;

import java.util.List;

import com.home.remote.api.entities.Config;


public interface ConfigService {
	
	void deleteConfig(Config config);

	List<Config> findAllConfig();

	Config findOneConfig(Long configId);

	Config saveConfig(Config config);

}
