package fr.xebia.blog.jerseyspring.business;

import org.jongo.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserService {

    @Autowired
    private MongoCollection usersCollection;

    public Iterable<User> listAll() {
        return usersCollection.find().as(User.class);
    }
}
