package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/home")
	public String index2(Model model) {
		String nombre = "Javier";
		model.addAttribute("nombre", nombre == null ? "Nombre no disponible" : "Javier");
		return "index";
	}

	@Autowired
	gestionAlmacen gestorTorre;

	@GetMapping("/listaproductos1")
	public String index(Model modelo) {
		modelo.addAttribute("listaproductos1", gestorTorre.listarTodosProductos1());
		return "index";
	}

}
