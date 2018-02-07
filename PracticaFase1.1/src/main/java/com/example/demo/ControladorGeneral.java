package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorGeneral {

	@RequestMapping("/index")
	public String peticiones_entrantes(Model modelo) {
		return "index";
	}
	
	@RequestMapping("/ligas")
	public String acceso_ligas(Model modelo) {
		return "ligas";
	}
	
	@RequestMapping("/clubs")
	public String acceso_clubs(Model modelo) {
		return "clubs";
	}
	
	@RequestMapping("/calendario")
	public String acceso_calendario(Model modelo) {
		return "calendario";
	}
	
	@RequestMapping("/noticias")
	public String acceso_noticias(Model modelo) {
		return "noticias";
	}
	
	@RequestMapping("/contacto")
	public String acceso_contacto(Model modelo) {
		return "contacto";
	}
	
	@RequestMapping("/listado_clubs")
	public String acceso_listado_clubs(Model modelo) {
		return "listado_clubs";
	}
	
	@RequestMapping("/edicion_clubs")
	public String acceso_edicion_clubs(Model modelo) {
		return "edicion_clubs";
	}
}
