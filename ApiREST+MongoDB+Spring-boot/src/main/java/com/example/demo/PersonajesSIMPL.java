package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonajesSIMPL {

    @Autowired
    private PersonajesRepo repo;

    public Flux<Personajes> allCharacters(){
        return this.repo.findAll();
    }
    public Mono<Personajes> addCharacters(Personajes personajes){
        return this.repo.save(personajes);
    }
    public Mono<Personajes> modifyCharacters(Personajes personajes){
        return this.repo.save(personajes);
    }
    public Mono<Personajes> SearchCharacters(String id){
        return this.repo.findById(id);
    }
    public Mono<Void> deleteCharacters(String id){
        return this.repo.deleteById(id);
    }
    public Mono<Void> deleteAllCharacters(){
        return this.repo.deleteAll();
    }

}
