package com.bookstore.bookstore.service;
import java.util.List;
import java.util.Optional;

import com.bookstore.bookstore.model.Employee;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {


	Optional<Employee> findOne(Long id);

	List<Employee> findAll();

	void update(Employee user);

	void save (Employee user);

	void delete(Long id);

	void delete(Employee user);




}