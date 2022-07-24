package com.greatlearning.empMng.service;

import java.util.List;

import com.greatlearning.empMng.entity.User;

public interface IUserService {

	// Save operation
	User saveUser(User user);

	// Read operation
	List<User> fetchUserList();

	// Update operation
	User updateUser(User user, Integer userId);

	// Delete operation
	void deleteUserById(Integer userId);

	User getUser(Integer Id);
	
	}

