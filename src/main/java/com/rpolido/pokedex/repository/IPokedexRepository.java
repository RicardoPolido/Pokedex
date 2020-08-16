package com.rpolido.pokedex.repository;

import com.rpolido.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IPokedexRepository extends ReactiveMongoRepository<Pokemon, String> {



}
