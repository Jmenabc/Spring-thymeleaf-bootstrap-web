package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class repoProducto2 {
	private static List<producto2> productos2 = new ArrayList<producto2>();
	static {
		productos2.add(new producto2("ordenador1", 200));
		productos2.add(new producto2("ordenador2", 350));
		productos2.add(new producto2("ordenador3", 120));
	}

	public List<producto2> listarTodos() {
		return productos2;
	}

	public void insertar(producto2 producto1) {
		productos2.add(producto1);
	}
}