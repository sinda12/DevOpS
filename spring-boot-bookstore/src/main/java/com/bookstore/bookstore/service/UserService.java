package com.bookstore.bookstore.service;
import java.util.List;
import java.util.Optional;
import com.bookstore.bookstore.model.Profile;


public interface UserService {
	
    Optional<Profile> findOne(Long id);
	
	List<Profile> findAll();
	
	void update(Profile user);
	
	void save (Profile user);
	
	void delete(Long id);
	
	void delete(Profile user);


}