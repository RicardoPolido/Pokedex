package com.rpolido.pokedex.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Pokemon {

    @Id
    private String id;

    private String name;
    private String category;
    private String hability;
    private Double weight;

}
