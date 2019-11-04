package eci.mongodb.data.repositories;

import eci.mongodb.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {


    User findBy_id(String _id);

}
