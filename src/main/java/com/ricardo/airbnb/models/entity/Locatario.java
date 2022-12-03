package com.ricardo.airbnb.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Locatario")
public class Locatario extends Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_locatario;

    public Locatario(int id_user, String user, String password, String email, String cpf, int id_locatario) {
        super(id_user, user, password, email, cpf);
        this.id_locatario = id_locatario;
    }

    public int getId_locatario() {
        return id_locatario;
    }

    public void setId_locatario(int id_locatario) {
        this.id_locatario = id_locatario;
    }

}
