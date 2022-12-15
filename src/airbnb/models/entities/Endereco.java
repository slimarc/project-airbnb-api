package airbnb.models.entities;

import java.util.List;

public class Endereco {
    private int id;
    private String bairro;
    private String cidade;
    private List<Item> listaItens; 

    
    public Endereco(int id, String bairro, String cidade) {
        this.id = id;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereco(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

}
