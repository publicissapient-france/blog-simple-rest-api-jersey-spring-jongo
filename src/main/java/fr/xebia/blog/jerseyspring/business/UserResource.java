package fr.xebia.blog.jerseyspring.business;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("users")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Component
public class UserResource {

    @Autowired
    private UserService userService;

    @GET
    public Iterable<User> listAllUsers() {
        return userService.listAll();
    }
}
