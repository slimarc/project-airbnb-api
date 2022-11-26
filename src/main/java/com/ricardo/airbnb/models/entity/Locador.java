package com.ricardo.airbnb.models.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Locador extends Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_locador;
    
    public Locador(int id_user, String user, String password, String email, String cpf, int id_locador){
        super(id_user, user, password, email, cpf);
        this.id_locador = id_locador;
    }

    public int getId_locador() {
        return id_locador;
    }

    public void setId_locador(int id_locador) {
        this.id_locador = id_locador;
    } 
}
