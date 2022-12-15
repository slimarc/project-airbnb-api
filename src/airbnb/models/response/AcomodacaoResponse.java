package airbnb.models.response;

import airbnb.models.entities.Endereco;
import airbnb.models.entities.Locador;

public class AcomodacaoResponse {
    private int id_item;
    private double valor_diaria;
    private int max_pessoas;
    private Endereco endereco;
    private Locador locador;
    private String descricao;
    private boolean disponivel;
    
    public AcomodacaoResponse(int id_item, double valor_diaria, int max_pessoas, Endereco endereco, Locador locador,
            String descricao) {
        this.id_item = id_item;
        this.valor_diaria = valor_diaria;
        this.max_pessoas = max_pessoas;
        this.endereco = endereco;
        this.locador = locador;
        this.descricao = descricao;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public int getMax_pessoas() {
        return max_pessoas;
    }

    public void setMax_pessoas(int max_pessoas) {
        this.max_pessoas = max_pessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Locador getLocador() {
        return locador;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
}
