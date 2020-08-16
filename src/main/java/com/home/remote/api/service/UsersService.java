package com.home.remote.api.service;

import java.util.List;

import com.home.remote.api.entities.Users;

public interface UsersService {

	void deleteUsers(Users users);

	List<Users> findAllUsers();

	Users findOneUsers(Long usersId);

	Users saveUsers(Users users);
}
