package airbnb.models.response;

public class LocatarioResponse {
    private int id_locatario;
    private String user;
    private String password;
    private String email;
    private String cpf;
    
    public LocatarioResponse(int id_locatario, String user, String password, String email, String cpf) {
        this.id_locatario = id_locatario;
        this.user = user;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId_locatario() {
        return id_locatario;
    }

    public void setId_locatario(int id_locatario) {
        this.id_locatario = id_locatario;
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
