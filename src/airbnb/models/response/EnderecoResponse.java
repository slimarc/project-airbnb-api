package airbnb.models.response;

public class EnderecoResponse {
    private String bairro;
    private String cidade;

    public EnderecoResponse(String bairro, String cidade) {
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


    
}
