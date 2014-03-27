package fr.xebia.blog.jerseyspring.business;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Path("healthcheck")
@Component
public class HealthCheckResource {

    @GET
    public String doesItWorks() {
        return "It works!";
    }
}
