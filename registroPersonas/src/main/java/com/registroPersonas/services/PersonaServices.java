package com.registroPersonas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registroPersonas.models.Persona;
import com.registroPersonas.repository.PersonaRepository;

@Service
public class PersonaServices {

	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> obtenerPersonas(){
		return (List<Persona>) personaRepository.findAll();
	}
	
	public Persona insertarPersona(Persona objPersona) {
		return personaRepository.save(objPersona);
	}
	
	public void eliminarPersona(Persona objPersona) {
		personaRepository.delete(objPersona);
	}
	
	
}
