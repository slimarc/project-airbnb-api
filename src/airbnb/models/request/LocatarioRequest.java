package airbnb.models.request;

import java.util.Objects;

public class LocatarioRequest {
    private int id_locatario;
    private String user;
    private String password;
    private String email;
    private String cpf;

    public LocatarioRequest(int id_locatario, String user, String password, String email, String cpf) {
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

    @Override
    public int hashCode() {
        return Objects.hash(id_locatario, user, password, email, cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LocatarioRequest that = (LocatarioRequest) obj;
        return Objects.equals(id_locatario, that.id_locatario) &&
               Objects.equals(user, that.user)         &&
               Objects.equals(password, that.password) && 
               Objects.equals(email, that.email)       && 
               Objects.equals(cpf, that.cpf);
    }

    @Override
    public String toString() {
        return "LocatarioRequest [id_locatario=" + id_locatario + ", user=" + user + ", password=" + password
                + ", email=" + email + ", cpf=" + cpf + "]";
    }
    

}
