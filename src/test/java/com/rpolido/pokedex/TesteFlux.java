package com.rpolido.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class TesteFlux {

    @Test
    public void testeFluxEmpty() {
        Flux.empty();
    }

    @Test
    public void testeFluxPokemon() {
        Flux<String> flux = Flux.just("Pokemon");
        flux.subscribe(System.out::println);
    }

    @Test
    public void testFluxInteger() {
        Flux<Integer> flux = Flux.just(10);
        flux.subscribe(System.out::println);
    }

    @Test
    public void testeFluxException() {
        Flux<String> flux = Flux.error(new RuntimeException("Ocorreu uma exceção "));
    }

    @Test
    public void testeFluxCompleto() {
        Flux<String> flux = Flux.just("Venusaur", "Charizard", "Blastoise");
        flux.subscribe(System.out::println);
    }

}
