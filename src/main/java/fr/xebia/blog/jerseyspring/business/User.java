package fr.xebia.blog.jerseyspring.business;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY // mandatory for serialization
)
public class User {

    @Email
    @NotBlank
    protected final String email;
    @NotBlank
    private final String firstname;
    @NotBlank
    private final String lastname;

    @JsonCreator
    public User(@JsonProperty("email") String email,
                @JsonProperty("firstname") String firstname,
                @JsonProperty("lastname") String lastname) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
