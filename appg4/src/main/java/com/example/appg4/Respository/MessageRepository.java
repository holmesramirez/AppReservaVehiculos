package com.example.appg4.Respository;

import com.example.appg4.Model.Car;
import com.example.appg4.Model.Message;
import com.example.appg4.Respository.ICRUD.IMessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private IMessageCrudRepository iMessageCrudRepository;

    //Buscar todos GET
    public List<Message> findAll(){ return (List<Message>) iMessageCrudRepository.findAll();}

    //Buscar especifico GET
    public Optional<Message> findById(int id){
        return iMessageCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Message save(Message message){
        return iMessageCrudRepository.save(message);
    }

    //Eliminar DELETE
    public void delete(Message message){
        iMessageCrudRepository.delete(message);
    }
}
