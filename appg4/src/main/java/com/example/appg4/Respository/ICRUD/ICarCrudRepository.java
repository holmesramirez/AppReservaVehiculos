package com.example.appg4.Respository.ICRUD;

import com.example.appg4.Model.Car;
import org.springframework.data.repository.CrudRepository;


public interface ICarCrudRepository extends CrudRepository<Car, Integer> {
}
