package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorBaseDeDatos{

	@Autowired
	private ClubRepositorio repositorio_de_clubs;
	
	@Autowired
	private JugadorRepositorio repositorio_de_jugadores;

	@RequestMapping("url_accionar_listado_clubs")
	public String listar_clubs(Model modelo,String nombre_club,boolean asc,boolean detallado) {
		List<Club> lista = new ArrayList<Club>();
		if(asc) {
			lista = repositorio_de_clubs.findByNombreOrderByNombreAsc(nombre_club);
		}else {
			lista = repositorio_de_clubs.findByNombreOrderByNombreDesc(nombre_club);
		}
		if(nombre_club.equals(""))
			lista = repositorio_de_clubs.findAll();
		modelo.addAttribute("lista",lista);
		modelo.addAttribute("nombre",nombre_club);
		modelo.addAttribute("orden",asc);
		return "listado_clubs";
	}
	
	@RequestMapping("url_accionar_creacion_club")
	public String crear_club(Model modelo, String nombre_club,long id) {
		List<Club> lista = repositorio_de_clubs.findAll();
		boolean repetido=false;
		Club club_repetido=null;
		for(Club c:lista) {
			if(c.getNombre().equals(nombre_club)) {
				repetido=true;
				club_repetido = c;
				break;
			}
		}
		if(repetido) {
			List<Jugador> li = club_repetido.getJugadores();
			li.add(repositorio_de_jugadores.getOne(id));			
		}else {
			repositorio_de_clubs.save(new Club(nombre_club));
		}
		return "edicion_clubs";
	}
}
