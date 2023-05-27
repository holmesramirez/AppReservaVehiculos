package com.example.appg4.Respository.ICRUD;

import com.example.appg4.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface IMessageCrudRepository extends CrudRepository<Message, Integer> {
}
