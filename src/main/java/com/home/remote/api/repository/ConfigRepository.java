package com.home.remote.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.remote.api.entities.Config;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {

	Config findOneConfigById(Long configId);
}
