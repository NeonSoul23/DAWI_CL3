package org.cyberpelis.controller;

import org.cyberpelis.model.Pelicula;
import org.cyberpelis.repository.IClasificacionRepository;
import org.cyberpelis.repository.IGeneroRepository;
import org.cyberpelis.repository.IPeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
	
	@Autowired
	private IClasificacionRepository repo;
	@Autowired
	private IGeneroRepository repos;
	@Autowired
	private IPeliculaRepository reposi;
	
	@GetMapping("/listar")
	public String listadoPeliculas(Model model) {
		model.addAttribute("lstClasificacion", repo.findAll());
		model.addAttribute("lstGenero", repos.findAll());
		
		model.addAttribute("lstPeliculas", reposi.findAll());
		return "farfan-listado";
	}
	
	@GetMapping("/cargar")
	public String cargarPeliculas(Model model) {
		model.addAttribute("pelicula", new Pelicula());
		model.addAttribute("lstClasificacion", repo.findAll());
		model.addAttribute("lstGenero", repos.findAll());
		return"farfan-mantenimiento";
	}
	
	@PostMapping("/editar")
	public String manteniminetoPeliculas(@ModelAttribute Pelicula pelicula, Model model) {
		System.out.println(pelicula);
		
		try {
			Pelicula p = reposi.findById(pelicula.getCodpelicula()).get();
			model.addAttribute("mensaje","La película ya existe");
		} catch (Exception e) {
			reposi.save(pelicula);
			model.addAttribute("mensaje","Producto registrado");
		}
		
		model.addAttribute("lstClasificacion", repo.findAll());
		model.addAttribute("lstGenero", repos.findAll());
		return"farfan-mantenimiento";
	}
	

}
