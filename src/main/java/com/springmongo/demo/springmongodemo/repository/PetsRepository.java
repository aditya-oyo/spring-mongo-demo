package com.springmongo.demo.springmongodemo.repository;

//this is the pets repository
import com.springmongo.demo.springmongodemo.model.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetsRepository extends MongoRepository<Pets,String> {
    Pets findBy_id(ObjectId _id);
    List<Pets> findAll();
    Pets save(Pets p);
    void delete(Pets p);
}
