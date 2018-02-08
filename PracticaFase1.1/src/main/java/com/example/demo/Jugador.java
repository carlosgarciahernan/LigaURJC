package com.example.demo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Jugador {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String genero;
	private int edad;
	private String provincia;
	private String ciudad;
	@OneToOne
    private Club clubActual;
	
	public Jugador() {
		
	}
	
	public Jugador(String nombre,String primerApellido,String segundoApellido,String genero,int edad,String provincia,String ciudad,Club clubActual,List<Club> historialClubs) {

		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.genero=genero;
		this.edad=edad;
		this.provincia=provincia;
		this.ciudad=ciudad;
		this.clubActual=clubActual;
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

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Club getClubActual() {
		return clubActual;
	}

	public void setClubActual(Club clubActual) {
		this.clubActual = clubActual;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
}
