package com.registroPersonas.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.registroPersonas.models.Persona;
import com.registroPersonas.services.PersonaServices;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonaController.class);
	
	private PersonaServices personaService;

	public PersonaController(PersonaServices personaService) {
		super();
		this.personaService = personaService;
	}
	
	@GetMapping(produces = "application/json")
	public List<Persona> obtenerPersonas(){
		return personaService.obtenerPersonas();
	}
	
	@PostMapping(produces = "application/json")
	public Persona ingresarPersona(@RequestBody @Validated Persona objPersona) {
		return personaService.insertarPersona(objPersona);
	}
	
	
	@PutMapping(produces = "application/json")
	public Persona actualizarPersona(@RequestBody @Validated Persona objPersona) {
		return personaService.insertarPersona(objPersona);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public boolean eliminarPersona(@RequestBody @Validated Persona objPersona) {
		personaService.eliminarPersona(objPersona);
		return true;
	}
	
}