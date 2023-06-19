package com.example.appg4.Respository;

import com.example.appg4.Model.Client;
import com.example.appg4.Model.DTOs.TotalAndClient;
import com.example.appg4.Model.Reservation;
import com.example.appg4.Respository.ICRUD.IReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private IReservationCrudRepository iReservationCrudRepository;

    //Buscar todos GET
    public List<Reservation> findAll(){
        return (List<Reservation>) iReservationCrudRepository.findAll();
    }

    //Buscar especifico GET
    public Optional<Reservation> findById(int id){
        return iReservationCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Reservation save(Reservation reservation){
        return iReservationCrudRepository.save(reservation);
    }

    //Eliminar DELETE
    public void delete(Reservation reservation){
        iReservationCrudRepository.delete(reservation);
    }

    //RETO 5
    //Reporte 1
    public List<Reservation> getReservationsBetweenDates(Date fechaA, Date fechaB){
        return iReservationCrudRepository.findAllByStartDateAfterAndDevolutionDateBefore(fechaA, fechaB);
    }
    //Reporte 2
    public List<Reservation> getReservationsByStatus(String status){
        return iReservationCrudRepository.findAllByStatus(status);
    }
    //Reporte 3
    public List<Object[]> getTotalReservationsByClient(){
            return iReservationCrudRepository.getTotalReservationsByClient();
    }
}
