package com.greatlearning.empMng.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.empMng.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}