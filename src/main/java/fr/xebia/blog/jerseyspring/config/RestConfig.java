package fr.xebia.blog.jerseyspring.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        packages("fr.xebia.blog.jerseyspring.business");
    }
}
