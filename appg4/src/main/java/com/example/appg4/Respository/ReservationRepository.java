package com.example.appg4.Respository;

import com.example.appg4.Model.Reservation;
import com.example.appg4.Respository.ICRUD.IReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
