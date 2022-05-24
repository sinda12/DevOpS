package com.bookstore.bookstore;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.bookstore.bookstore.model.Profile;
import com.bookstore.bookstore.repository.UserRepository;
import com.bookstore.bookstore.service.UserService;
import com.bookstore.bookstore.serviceImp.UserServiceImpl;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserTest {
	@Autowired
	private UserRepository repos;
	
	@Test
	@Rollback(false)
	public void createListUser() {
		Profile us = new Profile("mala","lklk","koko","dee","15151");
		Profile pr = repos.save(us);
		assertNotNull(pr);
	}
	@Test
	public void getListUser() {
		List<Profile> task = (List<Profile>) repos.findAll();
		Assertions.assertThat(task.size()).isGreaterThan(0);
	}
	@Test 
	public void testFindUserById() {
		String name = "lklk";
	    Profile user = repos.findByName(name);
	    Assertions.assertThat(user.getName()).isEqualTo(name);
	}
	
	
	
}
