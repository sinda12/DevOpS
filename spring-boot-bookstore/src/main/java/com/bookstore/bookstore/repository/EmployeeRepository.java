package com.bookstore.bookstore.repository;
import com.bookstore.bookstore.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bookstore.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {


   @Query("SELECT count(*) FROM Employee")
   public int countemp();

   @Query("SELECT nom FROM Employee")
   public List<String> employeNames();


      public Employee findByNom(String nom);


   @Modifying
   @Transactional
   @Query("UPDATE Employee e SET e.email=:email1 where e.id=:employeId")
   public void mettreAjourEmailByEmployeIdJPQL(@Param("email1")String email, @Param("employeId")long employeId);











}

