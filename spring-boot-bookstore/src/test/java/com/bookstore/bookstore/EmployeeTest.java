package com.bookstore.bookstore;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import com.bookstore.bookstore.service.EmployeeService;
import com.bookstore.bookstore.serviceImp.EmployeeServiceImp;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.bookstore.bookstore.model.Employee;
import com.bookstore.bookstore.repository.EmployeeRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeTest {
	@Autowired
	private EmployeeRepository repos;

	@Test
	@Rollback(false)
	public void createListUser() {
		Employee us = new Employee("mala","lklk","koko@gmail.com",true);
		Employee pr = repos.save(us);
		assertNotNull(pr);
	}
	@Test
	public void getListUser() {
		List<Employee> task = (List<Employee>) repos.findAll();
		Assertions.assertThat(task.size()).isGreaterThan(0);
	}
	@Test
	public void testFindUserById() {
		String name = "mala";
		Employee user = repos.findByNom(name);
	    Assertions.assertThat(user.getNom()).isEqualTo(name);
	}
	
	
}
