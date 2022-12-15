package airbnb.services.interfaces;

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

public interface IUsersService {

    AdminResponse createAdmin(AdminRequest adminRequest);

    LocatarioResponse createLocatario(LocatarioRequest locatarioRequest);

    LocadorResponse createLocador(LocadorRequest LocadorRequest);

    List<Users> findUsers();

    List<Admin> findAdmins();

    List<Locatario> findLocatarios();

    List<Locador> findLocador();

    void deleteUser(String cpf);
}
