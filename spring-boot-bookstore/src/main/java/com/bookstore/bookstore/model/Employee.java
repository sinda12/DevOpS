package com.bookstore.bookstore.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.*;
import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "Employee")
@Table(name = "profile")
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="prenom")
    private String prenom;
    @Column(name="nom")
    private String nom;

    @Column(name="email")
    private String email;
    @Column(name="act")
    private boolean isActif;



    //@JsonBackReference







    public Employee() {
        super();
    }

    public Employee(String nom, String prenom, String email, boolean isActif) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.isActif = isActif;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActif() {
        return isActif;
    }

    public void setActif(boolean isActif) {
        this.isActif = isActif;
    }





}
