package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCar;

    private String name;

    private String brand;

    private Integer year;

    private String description;

    //Gamaid
    @ManyToOne
    @JoinColumn(name = "gamaId")
    @JsonIgnoreProperties("cars")
    private Gama gama;

    //Message
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "car")
    @JsonIgnoreProperties({"car", "client"})
    private List <Message> messages;

    //Reservation
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "car")
    @JsonIgnoreProperties({"car", "client"})
    private List<Reservation> reservations;

}

