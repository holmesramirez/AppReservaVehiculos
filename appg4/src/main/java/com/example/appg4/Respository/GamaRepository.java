package com.example.appg4.Respository;

import com.example.appg4.Model.Gama;
import com.example.appg4.Respository.ICRUD.IGamaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GamaRepository {
    @Autowired
    private IGamaCrudRepository iGamaCrudRepository;

    //Buscar todos GET
    public List<Gama> findAll(){
        return (List<Gama>) iGamaCrudRepository.findAll();
    }

    //Buscar especifico GET
    public Optional<Gama> findById(int id){
        return iGamaCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Gama save(Gama gama){
        return iGamaCrudRepository.save(gama);
    }

    //Eliminar DELETE
    public void delete(Gama gama){
        iGamaCrudRepository.delete(gama);
    }
}
