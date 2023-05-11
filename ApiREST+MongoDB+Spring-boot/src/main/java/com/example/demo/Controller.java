package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private PersonajesSIMPL psimpl;

    @GetMapping("/allCharacters")
    public ResponseEntity<Flux<Personajes>> allCharacters(){
        Flux<Personajes> personajesFlux=this.psimpl.allCharacters();
        return new ResponseEntity<Flux<Personajes>>(personajesFlux, HttpStatus.OK);
    }
    @PostMapping("/addCharacters")
    public ResponseEntity<Mono<Personajes>> addCharacters(@RequestBody Personajes personajes){
        Mono<Personajes> personaje=this.psimpl.addCharacters(personajes);
        return new ResponseEntity<Mono<Personajes>>(personaje, HttpStatus.CREATED);
    }
    @PutMapping("/modifyCharacters")
    public ResponseEntity<Mono<Personajes>> modifyCharacters(@RequestBody Personajes personajes){
        Mono<Personajes> personaje=this.psimpl.modifyCharacters(personajes);
        return new ResponseEntity<Mono<Personajes>>(personaje, HttpStatus.CREATED);
    }
    @GetMapping("/SearchCharacters/{id}")
    public ResponseEntity<Mono<Personajes>> SearchCharacters(@PathVariable String id){
        Mono<Personajes> personaje=this.psimpl.SearchCharacters(id);
        return new ResponseEntity<Mono<Personajes>>(personaje, HttpStatus.OK);
    }
    @DeleteMapping("/deleteCharacters/{id}")
    public ResponseEntity<Mono<Void>> deleteCharacters(@PathVariable String id){
        Mono<Void> personaje=this.psimpl.deleteCharacters(id);
        return new ResponseEntity<Mono<Void>>(personaje, HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteAllCharacters")
    public ResponseEntity<Mono<Void>> deleteAllCharacters(){
        Mono<Void> personaje=this.psimpl.deleteAllCharacters();
        return new ResponseEntity<Mono<Void>>(personaje, HttpStatus.CREATED);
    }

}
