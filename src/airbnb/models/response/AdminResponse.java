package airbnb.models.response;

public class AdminResponse {
    private int id_admin;
    private String user;
    private String password;
    private String email;
    private String cpf;

    public AdminResponse(int id_admin, String user, String password, String email, String cpf) {
        this.id_admin = id_admin;
        this.user = user;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
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
