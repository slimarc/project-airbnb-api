package airbnb.models.entities;


public class Admin extends Users{
    private int id_admin;

    public Admin(int id_user, String user, String password, String email, String cpf, int id_admin) {
        super(id_user, user, password, email, cpf);
        this.id_admin = id_admin;
    }

    public Admin(){

    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
}
