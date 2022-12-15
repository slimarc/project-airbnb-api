package airbnb.models.entities;

public class Acomodacao extends Item{
    private int id_acomodacao;
    private String descricao;

    public Acomodacao(int id_item, double valor_diaria, int max_pessoas, Endereco endereco, int id_acomodacao, String descricao,
            Locador locador) {
        super(id_item, valor_diaria, max_pessoas, endereco, locador);
        this.id_acomodacao = id_acomodacao;
        this.locador = locador;
        this.descricao = descricao;
    }

    public Acomodacao(){
    }

    public int getId_acomodacao() {
        return id_acomodacao;
    }

    public void setId_acomodacao(int id_acomodacao) {
        this.id_acomodacao = id_acomodacao;
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

}
