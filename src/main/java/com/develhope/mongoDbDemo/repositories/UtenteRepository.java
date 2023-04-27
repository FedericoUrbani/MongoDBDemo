package com.develhope.mongoDbDemo.repositories;

import com.develhope.mongoDbDemo.entities.Utente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtenteRepository extends MongoRepository<Utente,String> {
}
