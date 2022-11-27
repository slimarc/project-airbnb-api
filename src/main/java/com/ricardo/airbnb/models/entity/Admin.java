package com.ricardo.airbnb.models.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin extends Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;

    public Admin(int id_user, String user, String password, String email, String cpf, int id_admin) {
        super(id_user, user, password, email, cpf);
        this.id_admin = id_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
}
