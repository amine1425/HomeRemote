package com.home.remote.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.remote.api.entities.Users;
import com.home.remote.api.repository.UsersRepository;
import com.home.remote.api.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepository UsersRepository;
	
	@Override
	public void deleteUsers(Users users) {
		// TODO Auto-generated method stub
		UsersRepository.delete(users);
	}

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return UsersRepository.findAll();
	}

	@Override
	public Users findOneUsers(Long usersId) {
		// TODO Auto-generated method stub
		return UsersRepository.findOneUsersById(usersId);
	}

	@Override
	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		return UsersRepository.save(users);
	}

}
