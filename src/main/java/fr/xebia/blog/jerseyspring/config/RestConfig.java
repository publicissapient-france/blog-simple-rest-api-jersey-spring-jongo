package fr.xebia.blog.jerseyspring.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationPath("api")
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        packages("fr.xebia.blog.jerseyspring");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        register(JacksonJsonProvider.class);
    }
}
