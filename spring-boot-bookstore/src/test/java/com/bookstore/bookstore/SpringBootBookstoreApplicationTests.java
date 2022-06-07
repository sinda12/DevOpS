package com.bookstore.bookstore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookstore.bookstore.repository.EmployeeRepository;

@SpringBootTest(classes=EmployeeRepository.class)
class SpringBootBookstoreApplicationTests {

	@Test
	void contextLoads() {
	}

}
