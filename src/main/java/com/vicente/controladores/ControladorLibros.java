package com.vicente.controladores;
import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@RequestMapping("libros")

	public class ControladorLibros {
		private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}
	
	@GetMapping
	public String obtenerTodosLosLibros(){
			StringBuilder resultado = new StringBuilder("Lista de libros:\n");
	        for (Map.Entry<String, String> entry : listaLibros.entrySet()) {
	            resultado.append("- ").append(entry.getKey())
	                    .append(" (Autor: ").append(entry.getValue()).append(")\n");
	        }
	        return resultado.toString();
	}
		
	@GetMapping
	public String obtenerInformacionDeLibro(@PathVariable String nombre, Model model) {
	    if (listaLibros.containsKey(nombre)) {
	        model.addAttribute("nombre", nombre);
	        model.addAttribute("autor", listaLibros.get(nombre));
	    } else {
	        model.addAttribute("error", "El libro no se encuentra en nuestra lista.");
	    }
	    return "detalleLibro";
	}
		
	@GetMapping("/libros/formulario")
	public String formularioLibro() {
	    return "formularioLibros";
	}
	
	@PostMapping("/procesa/libro")
	public String procesaLibro(@RequestParam String nombreLibro, @RequestParam String nombreAutor) {
	    listaLibros.put(nombreLibro, nombreAutor);
	    return "redirect:/libros";
	}
}
