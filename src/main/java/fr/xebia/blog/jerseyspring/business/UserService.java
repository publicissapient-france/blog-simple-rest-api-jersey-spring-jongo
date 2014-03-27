package fr.xebia.blog.jerseyspring.business;

import org.jongo.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserService {

    @Autowired
    private MongoCollection usersCollection;

    public void addUser(User newUser) {
        usersCollection.update("{ email: '" + newUser.getEmail() + "'}").upsert().with(newUser);
    }

    public Iterable<User> listAll() {
        return usersCollection.find().as(User.class);
    }
}
