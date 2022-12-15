package airbnb.models.entities;

public class Aventura extends Item{
    private int id_aventura;
    private String descricao;

    public Aventura(int id_item, double valor_diaria, int max_pessoas, Endereco endereco, Locador locador, int id_aventura,
            String descricao) {
        super(id_item, valor_diaria, max_pessoas, endereco, locador);
        this.id_aventura = id_aventura;
        this.descricao = descricao;
    }

    public Aventura(){
    }

    public int getId_aventura() {
        return id_aventura;
    }

    public void setId_aventura(int id_aventura) {
        this.id_aventura = id_aventura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 


}
