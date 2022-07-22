package com.greatlearning.empMng.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.empMng.entity.Roles;

public interface IRoleRepository extends JpaRepository<Roles, Integer> {

}