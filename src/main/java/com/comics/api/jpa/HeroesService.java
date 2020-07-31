package com.comics.api.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comics.api.model.Heroe;
import com.comics.api.repository.HeroesRepository;
import com.comics.api.service.IHeroesService;

@Service
public class HeroesService implements IHeroesService {

	@Autowired
	private HeroesRepository heroeRepo;
	
	@Override
	public Heroe buscarPorId(int id) {	
		Optional<Heroe> heroeOp = heroeRepo.findById(id);
		if( heroeOp.isPresent()) {
			return heroeOp.get();
		}
		return null;
	}
	
	@Override
	public List<Heroe> buscarTodos() {
		return heroeRepo.findAll();
	}
	
	@Override
	public void guardar(Heroe heroe) {
		heroeRepo.save(heroe);
	}

	@Override
	public void elminar(int id) {
		heroeRepo.deleteById(id);		
	}

	@Override
	public void guardatTodos(List <Heroe> heroes) {
		heroeRepo.saveAll( heroes);		
	}		
	

}
