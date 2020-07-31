package com.comics.api.service;

import java.util.List;

import com.comics.api.model.Heroe;

public interface IHeroesService {
	
	List <Heroe> buscarTodos(); 
	
	Heroe buscarPorId(int id);
	
	void guardar(Heroe heroe);
	
	void guardatTodos(List <Heroe> heroes);
	
	void elminar(int id);

}
