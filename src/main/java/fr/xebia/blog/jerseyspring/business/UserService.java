package fr.xebia.blog.jerseyspring.business;

import java.util.List;
import org.springframework.stereotype.Service;
import jersey.repackaged.com.google.common.collect.Lists;

@Service
class UserService {

    public List<User> listAll() {
        return Lists.newArrayList(
                new User("Roger", "Couderc"),
                new User("Pierre", "Albaladejo"),
                new User("Serge", "Blanco")
        );
    }
}
