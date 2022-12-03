package com.ricardo.airbnb.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Acomodacao")
public class Acomodacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_acomodacao;
    
    @Column(name= "valor_diaria")
    private double valor_diaria;

    @Column(name="max_pessoas")
    private int max_pessoas;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_locador")
    private Locador locador;

    public Acomodacao(int id_acomodacao, double valor_diaria, int max_pessoas){
        this.id_acomodacao = id_acomodacao;
        this.valor_diaria = valor_diaria;
        this.max_pessoas = max_pessoas;
    }

    public int getId_acomodacao() {
        return id_acomodacao;
    }

    public void setId_acomodacao(int id_acomodacao) {
        this.id_acomodacao = id_acomodacao;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public int getMax_pessoas(){
        return max_pessoas;
    }

    public void setMax_pessoas(int max_pessoas){
        this.max_pessoas = max_pessoas;
    }

}
