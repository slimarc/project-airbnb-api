package airbnb.models.response;

public class LocadorResponse {
    private int id_locador;
    private String user;
    private String password;
    private String email;
    private String cpf;

    public LocadorResponse(int id_locador, String user, String password, String email, String cpf) {
        this.id_locador = id_locador;
        this.user = user;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId_locador() {
        return id_locador;
    }

    public void setId_locador(int id_locador) {
        this.id_locador = id_locador;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
