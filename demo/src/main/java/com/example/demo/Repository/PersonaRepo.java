package com.example.demo.Repository;

import com.example.demo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends CrudRepository<Persona,Integer> {

}
