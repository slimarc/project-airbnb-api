package airbnb.models.entities;

public class Locatario extends Users {
    private int id_locatario;

    public Locatario(int id_user, String user, String password, String email, String cpf, int id_locatario) {
        super(id_user, user, password, email, cpf);
        this.id_locatario = id_locatario;
    }

    public Locatario(){ 
    }

    public int getId_locatario() {
        return id_locatario;
    }

    public void setId_locatario(int id_locatario) {
        this.id_locatario = id_locatario;
    }

}
