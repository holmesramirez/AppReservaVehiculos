package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;

    private String messageText;

    //Se realaciona con:
    //Car
    @ManyToOne
    @JoinColumn(name = "carId")
    @JsonIgnoreProperties({"message", "reservations"})
    private Car car;


    //Client
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messages", "reserbations"})
    private Client client;

}
