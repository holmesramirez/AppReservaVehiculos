package com.example.appg4.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;

    private String messageText;

    private Integer stars;

    //Se relaciona con:
    //Reservation
    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;
}
