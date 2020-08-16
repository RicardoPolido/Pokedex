package com.rpolido.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class TesteMono {

    @Test
    public void testeMonoEmpty() {
        Mono<String> mono = Mono.empty();
    }

    @Test
    public void testeMonoPokemon() {
        Mono<String> mono = Mono.just("Pokemon");
        mono.subscribe(System.out::println);
    }

    @Test
    public void testMonoInteger() {
        Mono<Integer> mono = Mono.just(10);
        mono.subscribe(System.out::println);
    }

    @Test
    public void testeMonoException() {
        Mono<String> mono = Mono.error(new RuntimeException("Ocorreu uma exceção "));
    }

}
