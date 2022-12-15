package airbnb.services.implement;

import java.util.List;

import airbnb.models.entities.Admin;
import airbnb.models.entities.Locador;
import airbnb.models.entities.Locatario;
import airbnb.models.entities.Users;
import airbnb.models.request.AdminRequest;
import airbnb.models.request.LocadorRequest;
import airbnb.models.request.LocatarioRequest;
import airbnb.models.response.AdminResponse;
import airbnb.models.response.LocadorResponse;
import airbnb.models.response.LocatarioResponse;
import airbnb.services.interfaces.IUsersService;

public class UsersServiceImpl implements IUsersService{

    private List<Users> usersList;
    private List<Admin> adminsList;
    private List<Locatario> locatariosList;
    private List<Locador> locadoresList;

    public AdminResponse createAdmin(AdminRequest adminRequest){
        Admin admin = new Admin();
        admin.setId_admin(adminRequest.getId_admin());
        admin.setUser(adminRequest.getUser());
        admin.setPassword(adminRequest.getPassword());
        admin.setEmail(adminRequest.getEmail());
        admin.setCpf(adminRequest.getCpf()); 
        usersList.add(admin);
        adminsList.add(admin);
        return new AdminResponse(admin.getId_admin(), admin.getUser(), admin.getPassword(), admin.getEmail(), admin.getCpf());
    }

    public LocatarioResponse createLocatario(LocatarioRequest locatarioRequest){
        Locatario locatario = new Locatario();
        locatario.setId_locatario(locatarioRequest.getId_locatario());
        locatario.setUser(locatarioRequest.getUser());
        locatario.setPassword(locatarioRequest.getPassword());
        locatario.setEmail(locatarioRequest.getEmail());
        locatario.setCpf(locatarioRequest.getCpf());
        usersList.add(locatario);
        locatariosList.add(locatario);
        return new LocatarioResponse(locatario.getId_locatario(), locatario.getUser(), locatario.getPassword(), locatario.getEmail(), locatario.getCpf());
    }
    public LocadorResponse createLocador(LocadorRequest locadorRequest){
        Locador locador = new Locador();
        locador.setId_locador(locadorRequest.getId_locador());
        locador.setUser(locadorRequest.getUser());
        locador.setPassword(locadorRequest.getPassword());
        locador.setEmail(locadorRequest.getEmail());
        locador.setCpf(locadorRequest.getCpf());
        usersList.add(locador);
        locadoresList.add(locador);
        return new LocadorResponse(locador.getId_locador(), locador.getUser(), locador.getPassword(), locador.getEmail(), locador.getCpf());
    }

    public List<Users> findUsers(){
        return usersList;
    }

    public List<Admin> findAdmins(){
        return adminsList;
    }

    public List<Locatario> findLocatarios(){
        return locatariosList;
    }

    public List<Locador> findLocador(){
        return locadoresList;
    }

    public void deleteUser(String cpf){
        for(Users user:usersList){
            if(user.getCpf().equals(cpf)){
                usersList.remove(user);
            }
        }
    }

}
