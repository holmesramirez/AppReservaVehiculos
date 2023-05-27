package com.example.appg4.Respository;

import com.example.appg4.Model.Car;
import com.example.appg4.Respository.ICRUD.ICarCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CarRepository {
    @Autowired
    private ICarCrudRepository iCarCrudRepository;

    //Buscar todos GET
    public List<Car> findAll(){
        return (List<Car>) iCarCrudRepository.findAll();
    }

    //Buscar especifico GET
    public Optional<Car> findById(int id){
        return iCarCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Car save(Car car){
        return iCarCrudRepository.save(car);
    }

    //Eliminar DELETE
    public void delete(Car car){
        iCarCrudRepository.delete(car);
    }



}
