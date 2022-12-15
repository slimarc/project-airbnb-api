package airbnb.models.request;

import java.util.Objects;

public class AdminRequest {
    
    private int id_admin;
    private String user;
    private String password;
    private String email;
    private String cpf;

    public AdminRequest(int id_admin, String user, String password, String email, String cpf) {
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

    @Override
    public int hashCode() {
        return Objects.hash(id_admin, user, password, email, cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AdminRequest that = (AdminRequest) obj;
        return Objects.equals(id_admin, that.id_admin) &&
               Objects.equals(user, that.user)         &&
               Objects.equals(password, that.password) && 
               Objects.equals(email, that.email)       && 
               Objects.equals(cpf, that.cpf);
    }

    @Override
    public String toString() {
        return "AdminRequest [id_admin=" + id_admin + ", user=" + user + ", password=" + password + ", email=" + email
                + ", cpf=" + cpf + "]";
    }

}
