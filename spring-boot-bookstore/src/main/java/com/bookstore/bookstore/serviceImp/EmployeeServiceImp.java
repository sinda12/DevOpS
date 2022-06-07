package com.bookstore.bookstore.serviceImp;



import java.util.List;
import java.util.Optional;

import com.bookstore.bookstore.model.Employee;
import com.bookstore.bookstore.repository.EmployeeRepository;
import com.bookstore.bookstore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeRepository repository ;
	
	
	@Override
	public Optional<Employee> findOne(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void update(Employee user) {
		// TODO Auto-generated method stub
		repository.save(user);
		
	}

	@Override
	public void save(Employee user) {
		// TODO Auto-generated method stub
		repository.save(user);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void delete(Employee user) {
		// TODO Auto-generated method stub
		repository.delete(user);
	}

}
