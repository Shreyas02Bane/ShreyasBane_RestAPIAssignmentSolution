package com.greatlearning.empMng.service;

import java.util.List;

import com.greatlearning.empMng.entity.Role;


public interface IRoleService {

	// Save operation Create
    Role saveRole(Role role);
 
    // Read operation
    List<Role> fetchRoleList();
 
    // Update operation
    Role updateRole(Role role,Integer Id);
 
    // Delete operation
    void deleteRoleById(Integer Id);
	
}