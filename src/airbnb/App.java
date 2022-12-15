package airbnb;

import airbnb.models.request.AdminRequest;
import airbnb.services.implement.UsersServiceImpl;

public class App {
    public static void main(String[] args){
        
        UsersServiceImpl user = new UsersServiceImpl();
        AdminRequest admin = new AdminRequest(12,"Ricardo","123413","teste@teste.com", "123.547.489-00");
        
        user.createAdmin(admin);

        System.out.println(admin.toString());
        
        
    
    }
}
