package airbnb.models.entities;

public class Experiencia extends Item{
    private int id_experiencia;
    private String descricao;

    public Experiencia(int id_item, double valor_diaria, int max_pessoas, Endereco endereco, Locador locador, int id_experiencia, String descricao) {
        super(id_item, valor_diaria, max_pessoas, endereco, locador);
        this.descricao = descricao;
        this.id_experiencia = id_experiencia;
    }
    
    public Experiencia(){
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_experiencia() {
        return id_experiencia;
    }

    public void setId_experiencia(int id_experiencia) {
        this.id_experiencia = id_experiencia;
    }
    
    


}
