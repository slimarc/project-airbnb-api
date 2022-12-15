package airbnb.models.request;

import java.util.Objects;


public class EnderecoRequest {
    
    private String bairro;
    private String cidade;
    
    public EnderecoRequest(String bairro, String cidade) {
        this.bairro = bairro;
        this.cidade = cidade;
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

    @Override
    public int hashCode() {
        return Objects.hash(cidade, bairro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EnderecoRequest that = (EnderecoRequest) obj;
        return Objects.equals(cidade, that.cidade) &&
               Objects.equals(bairro, that.bairro);

    }

    @Override
    public String toString() {
        return "Endereco [bairro=" + bairro + ", cidade=" + cidade + "]";
    }
    





}
