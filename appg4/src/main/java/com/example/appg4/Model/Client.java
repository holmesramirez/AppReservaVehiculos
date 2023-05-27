package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    private String email;

    private String password;

    private String name;

    private Integer age;

    //Se relaciona con:
    //Mensajes
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List <Message> messages;

    //Reservas
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;
}
