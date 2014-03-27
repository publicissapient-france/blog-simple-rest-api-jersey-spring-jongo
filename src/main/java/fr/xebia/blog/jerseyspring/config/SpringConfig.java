package fr.xebia.blog.jerseyspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "fr.xebia.blog.jerseyspring.business")
public class SpringConfig {
}
