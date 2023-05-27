package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table (name = "gama")
public class Gama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGama;

    private String name;

    private String description;

    //Car
    //Relación de (1 - N) de tabla Gama con tabla Car
    //mappedBy = "gama" indica la llave foranea
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gama")
    @JsonIgnoreProperties("gama")
    private List<Car> cars;
}
