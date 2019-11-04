package eci.mongodb.data.repositories;

import eci.mongodb.data.model.Todo;
import eci.mongodb.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    List<Todo> findByResponsible(User responsible);

}


