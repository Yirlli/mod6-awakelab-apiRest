package com.MvcRest.proyecto.implemen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MvcRest.proyecto.dao.PersonaDao;
import com.MvcRest.proyecto.model.Persona;
import com.MvcRest.proyecto.servicio.PersonaService;



@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaDao dao;

	@Override
	@Transactional(readOnly=true)
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return (List<Persona>) dao.findAll();
	}

	@Override
	@Transactional
	public void save(Persona persona) {
		// TODO Auto-generated method stub
		dao.save(persona);
	}

	@Override
	@Transactional(readOnly=true)
	public void delete(Persona persona) {
		// TODO Auto-generated method stub
		dao.delete(persona);
	}

	@Override
	@Transactional(readOnly=true)
	public Persona findPersona(Persona persona) {
		// TODO Auto-generated method stub
		return dao.findById(persona.getId_p()).orElse(null);
	}

}
