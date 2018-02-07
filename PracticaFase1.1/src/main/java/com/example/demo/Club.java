package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	//private Entrenador entrenador;
	private String nombre;
	
	@OneToMany(mappedBy="clubActual")
	private List<Jugador> jugadores;
	
	//private Presidente presidente;
	private String abreviatura;
	//private List<Liga> participa_liga;
	//private List<Torneo> participa_torneo;
	
	
	public Club() {
		
	}
	
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
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

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public Club(String nombre) {
		this.nombre=nombre;
		jugadores = new ArrayList<Jugador>();
		jugadores.add(new Jugador("carlos", nombre, nombre, nombre, 0, nombre, nombre, null, null));
	}
}
