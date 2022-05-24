
package com.bookstore.bookstore.model;
import java.math.*;
import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="profile")
@Data
public class Profile {
    public Profile(String email, String name, String password, String last_name, String tel) {
		super();
	
		this.email = email;
		this.name = name;
		this.password = password;
		this.last_name = last_name;
		this.tel = tel;
	}
    public  Profile() {
		
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name="email")
    private String email;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="last_name")
    private String last_name;
    @Column(name="tel")
    private String tel ;
	

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String lastName) {
        this.last_name = last_name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }





}
