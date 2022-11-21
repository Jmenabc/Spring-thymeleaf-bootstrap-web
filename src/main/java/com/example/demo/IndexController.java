package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("mundo", "Mundo");
		return "index";
	}

	@RequestMapping("/HolaMundo")
	public String HolaMundo(Model model) {
		model.addAttribute("username", "Javier Mena-Bernal Carranza");
		return "holamundo";
	}

	@Autowired
	gestionAlmacen gestorTorre;

	@RequestMapping("/ListaPedidos")
	public String ListaPedidos(Model model) {
		model.addAttribute("lista", gestorTorre.listarTodosProductos1());
		return "listapedidos";
	}

}
