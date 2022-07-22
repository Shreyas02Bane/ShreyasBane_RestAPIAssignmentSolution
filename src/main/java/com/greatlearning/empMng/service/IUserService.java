package com.greatlearning.empMng.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.empMng.entity.User;

public interface IUserService {
	public List<User> findAll();

	public Optional<User> findById(long theId);

	public void save(User theUser);

	public void deleteById(long theId);

	public Optional<User> findByUserName(String userName);
}