package airbnb.models.entities;

public abstract class Users {

    private int id_user;
    protected String user;
    protected String password;
    protected String email;
    protected String cpf;

    public Users(int id_user, String user, String password, String email, String cpf){
        this.id_user = id_user;
        this.user = user;
        this.password = password;
        this.email = email;
        this.cpf = cpf;
    }

    public Users(){
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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
