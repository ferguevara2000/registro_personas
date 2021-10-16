package com.registroPersonas.repository;

import org.springframework.data.repository.CrudRepository;

import com.registroPersonas.models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, String>{

}
