package airbnb.models.entities;

import java.util.List;

public class Locador extends Users{
    private int id_locador;
    private List<Item> listaItens;
    
    public Locador(int id_user, String user, String password, String email, String cpf, int id_locador,
            List<Item> listaItens) {
        super(id_user, user, password, email, cpf);
        this.id_locador = id_locador;
        this.listaItens = listaItens;
    }

    public Locador(){ 
    }

    public int getId_locador() {
        return id_locador;
    }

    public void setId_locador(int id_locador) {
        this.id_locador = id_locador;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }
    
    
}
