package com.greatlearning.empMng.repos;

import org.springframework.data.repository.CrudRepository;

import com.greatlearning.empMng.entity.Role;

public interface IRolesRepository extends CrudRepository<Role, Integer> {

}