package com.example.appg4.Respository;

import com.example.appg4.Model.Car;
import com.example.appg4.Model.Client;
import com.example.appg4.Respository.ICRUD.IClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private IClientCrudRepository iClientCrudRepository;

    //Buscar todos GET
    public List<Client> findAll(){
        return (List<Client>) iClientCrudRepository.findAll();
    }

    //Buscar especifico GET
    public Optional<Client> findById(int id){
        return iClientCrudRepository.findById(id);
    }

    //Guardar y/o actualizar POST o PUT
    public Client save(Client client){
        return iClientCrudRepository.save(client);
    }

    //Eliminar DELETE
    public void delete(Client client){
        iClientCrudRepository.delete(client);
    }

}
