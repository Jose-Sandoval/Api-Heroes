package com.comics.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comics.api.model.Heroe;

public interface HeroesRepository extends JpaRepository<Heroe, Integer> {

}
