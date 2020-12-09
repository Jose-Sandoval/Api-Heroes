package com.comics.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comics.api.model.Heroe;
import com.comics.api.service.IHeroesService;


@RestController
@RequestMapping("/api")
public class HeroeController {
	
	@Autowired
	private IHeroesService heroeService; 	
	
	@GetMapping("/heroes")
	public List<Heroe> buscarTodos(){
		return heroeService.buscarTodos();
	}
	
	//@RequestMapping(value="/heroes/{id}", method = RequestMethod.GET)
	@GetMapping("heroes/{id}")	
	public Heroe buscarPorId(@PathVariable("id") int id) {
		return heroeService.buscarPorId(id);		
	}
	
	@PostMapping("/heroes")
	public Heroe guardar(@RequestBody Heroe heroe){ 
		heroeService.guardar(heroe);
		System.out.println(heroe);
		return heroe;
	}
	
	@PostMapping("/heroes/save")
	public List <Heroe> guardarTodos(@RequestBody List <Heroe> heroes){ 
		heroeService.guardatTodos(heroes);
		System.out.println(heroes);
		return heroes;
	}
	
	@PutMapping("/heroes")
	public Heroe modificar(@RequestBody Heroe heroe){ 
		heroeService.guardar(heroe);
		System.out.println(heroe);
		return heroe;
	}
	
	@DeleteMapping("/heroes/{id}")
	public void eliminar(@PathVariable("id") int id) {
		heroeService.elminar(id);		
	}
}
