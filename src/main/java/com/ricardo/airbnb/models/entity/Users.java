package com.ricardo.airbnb.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    
    @Column(unique = true)
    private String user;

    @Column(name = "password")
    private String password;
    
    @Column(unique = true)
    private String email;
    
    @Column(unique = true)
    private String cpf;

    public Users(int id_user, String user, String password, String email, String cpf){
        this.id_user = id_user;
        this.user = user;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

}
