package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.middleware.Middleware;
import behavioral.chainofresponsibility.middleware.RoleCheckMiddleware;
import behavioral.chainofresponsibility.middleware.ThrottlingMiddleware;
import behavioral.chainofresponsibility.middleware.UserExistsMiddleware;
import behavioral.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() throws IOException {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do{
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
            if(success){
                System.out.println("Authorization have been successful!");
            }else{
                System.out.println("Authorization have been failed!");
            }


        }while(!success);
    }
}
