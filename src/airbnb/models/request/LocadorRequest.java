package airbnb.models.request;

import java.util.Objects;

public class LocadorRequest {
    private int id_locador;
    private String user;
    private String password;
    private String email;
    private String cpf;

    public LocadorRequest(int id_locador, String user, String password, String email, String cpf) {
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

    @Override
    public int hashCode() {
        return Objects.hash(id_locador, user, password, email, cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LocadorRequest that = (LocadorRequest) obj;
        return Objects.equals(id_locador, that.id_locador) &&
               Objects.equals(user, that.user)         &&
               Objects.equals(password, that.password) && 
               Objects.equals(email, that.email)       && 
               Objects.equals(cpf, that.cpf);
    }

    @Override
    public String toString() {
        return "LocadorRequest [id_locador=" + id_locador + ", user=" + user + ", password=" + password + ", email="
                + email + ", cpf=" + cpf + "]";
    }

    public void findUsers() {
    }

}
