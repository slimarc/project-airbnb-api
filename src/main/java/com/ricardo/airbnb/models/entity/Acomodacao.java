package com.ricardo.airbnb.models.entity;

import com.ricardo.airbnb.exception.MaxPessoasException;

public class Acomodacao {
    private int id_acomodacao;
    private double valor_diaria;
    private int max_pessoas;

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

    public int getMax_pessoas() throws MaxPessoasException{
        MaxPessoasException error = new MaxPessoasException();
        String message = "O número máximo de pessoas por acomodação são o total de duas.";
        error.numMaxException(message);
        if (max_pessoas > 2){
            throw error;
        }else{
            return max_pessoas;
        }
    }

    public void setMax_pessoas(int max_pessoas){
        this.max_pessoas = max_pessoas;
    }

}
