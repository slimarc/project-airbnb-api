package com.ricardo.airbnb.models.entity;

public class Testeacomodacao {
    public static void main(String args[]){
        Acomodacao teste = new Acomodacao(1, 150.00, 1);
        System.out.println("O numero maximo de pessoas foi: " + teste.getMax_pessoas());
    }
}
