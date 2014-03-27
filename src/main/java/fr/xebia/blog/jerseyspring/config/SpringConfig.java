package fr.xebia.blog.jerseyspring.config;

import java.net.UnknownHostException;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.mongodb.DB;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan(basePackages = "fr.xebia.blog.jerseyspring.business")
public class SpringConfig {

    @Bean(name = "usersCollection")
    public MongoCollection getScoresCollection() throws UnknownHostException {
        DB db = new MongoClient().getDB("xebians");
        Jongo jongo = new Jongo(db);
        return jongo.getCollection("users");
    }
}
