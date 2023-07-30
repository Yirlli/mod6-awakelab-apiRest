package com.MvcRest.proyecto.servicio;


import java.util.List;

import com.MvcRest.proyecto.model.*;


public interface PersonaService {
	
	public List<Persona> listarPersonas();
	
	public void save(Persona persona);
	
	public void delete(Persona persona );
	
	public Persona findPersona(Persona persona);

}
