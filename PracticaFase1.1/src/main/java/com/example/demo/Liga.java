package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Liga {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	//private List<Partido> partidos_planificados;
	
	
	private ArrayList<Club> listado_de_clubs;

	public ArrayList<Club> getListado_de_clubs() {
		return listado_de_clubs;
	}

	public void setListado_de_clubs(ArrayList<Club> listado_de_clubs) {
		this.listado_de_clubs = listado_de_clubs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
