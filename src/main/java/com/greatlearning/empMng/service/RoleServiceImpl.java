package com.greatlearning.empMng.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.empMng.entity.Role;
import com.greatlearning.empMng.repos.IRolesRepository;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	private IRolesRepository roleRepository;

	// Save or Create operation

	@Override
	public Role saveRole(Role role) {

		return roleRepository.save(role);
	}

	// Read operation

	@Override
	public List<Role> fetchRoleList() {

		return (List<Role>) roleRepository.findAll();
	}

	// Update Operation

	@Override
	public Role updateRole(Role role, Integer Id) {

		Role roleDB = roleRepository.findById(Id).get();

		if (Objects.nonNull(role.getName()) && !"".equalsIgnoreCase(role.getName())) {
			roleDB.setName(role.getName());
		}

		return roleRepository.save(roleDB);
	}

	// Delete Operation

	@Override
	public void deleteRoleById(Integer Id) {

		roleRepository.deleteById(Id);

	}

}