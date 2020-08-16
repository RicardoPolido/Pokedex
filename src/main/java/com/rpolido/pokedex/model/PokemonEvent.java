package com.rpolido.pokedex.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PokemonEvent {

    private Long eventId;
    private String eventType;

}
