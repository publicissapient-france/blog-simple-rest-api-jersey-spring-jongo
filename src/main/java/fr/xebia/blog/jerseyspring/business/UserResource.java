package fr.xebia.blog.jerseyspring.business;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.ok;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
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

    @PUT
    public Response addUser(@NotNull @Valid User newUser) {
        userService.addUser(newUser);
        return ok().status(CREATED).build();
    }
}
