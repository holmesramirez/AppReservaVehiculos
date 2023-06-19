package com.example.appg4.Respository.ICRUD;

import com.example.appg4.Model.Reservation;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface IReservationCrudRepository extends CrudRepository<Reservation, Integer> {

    //Los reportes se puedes solicitar mediante consultas o querys SQL

    //Reporte 1
    // SELECT * FROM Reservation WHERE starDate AFTER fechaA AND devolutionDate BEFORE fechaB;

    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date fechaA, Date fechaB);

    //Reporte 2
    // SELECT * FROM Reservation WHERE status = "valorNecesite";

    public List<Reservation> findAllByStatus(String status);

    //Reporte 3
    // SELECT client, COUNT(client) FROM Reservation GROUP BY client ORDER BY COUNT(client) DESC;
    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client) DESC")
    public List<Object[]> getTotalReservationsByClient();
}
