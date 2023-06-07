package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;

    private Date startDate;

    private Date devolutionDate;

    private String status = "created";

    //Se relaciona con:
    //Car
    @ManyToOne
    @JoinColumn(name = "carId")
    @JsonIgnoreProperties("resservations")
    private Car car;

    //Client
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"reservations", "messages"})
    private Client client;

    //Score
    @OneToOne
    @JsonIgnoreProperties("reservation")
    private Score score;

}
