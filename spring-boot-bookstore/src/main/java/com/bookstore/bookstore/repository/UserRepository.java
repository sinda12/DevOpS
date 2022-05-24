package com.bookstore.bookstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore.bookstore.model.Profile;


public interface UserRepository extends JpaRepository<Profile, Long>{
   public Profile findByName(String name);
}

