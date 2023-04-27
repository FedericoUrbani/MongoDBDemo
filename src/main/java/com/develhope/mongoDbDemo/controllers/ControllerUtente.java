package com.develhope.mongoDbDemo.controllers;

import com.develhope.mongoDbDemo.entities.Utente;
import com.develhope.mongoDbDemo.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Utente")
public class ControllerUtente {

    @Autowired
    private UtenteRepository userRepository;
    @PostMapping("")
    public Utente createUtente (@RequestBody Utente utente){
        utente.setId(null);
        return userRepository.save(utente);
    }
    @GetMapping
    public List<Utente> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utente> getUser(@PathVariable String id){
        return userRepository.findById(id);
    }

}
