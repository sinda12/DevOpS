package com.bookstore.bookstore.serviceImp;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.model.Profile;
import com.bookstore.bookstore.repository.UserRepository;
import com.bookstore.bookstore.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository ;
	
	
	@Override
	public Optional<Profile> findOne(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void update(Profile user) {
		// TODO Auto-generated method stub
		repository.save(user);
		
	}

	@Override
	public void save(Profile user) {
		// TODO Auto-generated method stub
		repository.save(user);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void delete(Profile user) {
		// TODO Auto-generated method stub
		repository.delete(user);
	}

}
