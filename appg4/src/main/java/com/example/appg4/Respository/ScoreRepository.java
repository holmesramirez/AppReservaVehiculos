package com.example.appg4.Respository;

import com.example.appg4.Model.Message;
import com.example.appg4.Model.Score;
import com.example.appg4.Respository.ICRUD.IScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {
    @Autowired
    private IScoreCrudRepository iScoreCrudRepository;

    //Buscar todos GET
    public List<Score> findAll(){ return (List<Score>) iScoreCrudRepository.findAll();}

    //Buscar especifico GET
    public Optional<Score> findById(int id){
        return iScoreCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Score save(Score score){
        return iScoreCrudRepository.save(score);
    }

    //Eliminar DELETE
    public void delete(Score score){
        iScoreCrudRepository.delete(score);
    }
}
