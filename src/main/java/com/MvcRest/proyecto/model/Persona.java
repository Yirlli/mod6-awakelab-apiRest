package com.MvcRest.proyecto.model;

import java.io.Serializable;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable { //serializable son las entidaes que estan constantemente en uso
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //permite hacerlo autoincremental el auto, es el que viene por defecto uno selecciona como se tratara el tipo de dato 
	private Long id_p;
	private String nombre;
	private String apellido;
	private String email;
	public Long getId_p() {
		return id_p;
	}
	public void setId_p(Long id_p) {
		this.id_p = id_p;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}