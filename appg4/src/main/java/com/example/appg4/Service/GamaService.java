package com.example.appg4.Service;

import com.example.appg4.Model.Car;
import com.example.appg4.Model.Gama;
import com.example.appg4.Respository.CarRepository;
import com.example.appg4.Respository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamaService {
    @Autowired
    private GamaRepository gamaRepository;

    public List<Gama> findAll(){
        return gamaRepository.findAll();
    }

    public Optional<Gama> getGama(int id){
        return gamaRepository.findById(id);
    }

    public Gama save(Gama gama){
        if (gama.getIdGama()==null){
            return gamaRepository.save(gama);
        }else {
            Optional<Gama> gamaEncontrada = getGama(gama.getIdGama());
            if (gamaEncontrada.isEmpty()){
                return gamaRepository.save(gama);
            }else {
                return gama;
            }
        }
    }

    public Gama update(Gama gama) {
        if (gama.getIdGama() != null) {
            Optional<Gama> gamaEncontrada = getGama(gama.getIdGama());
            if (gamaEncontrada.isPresent()) {
                if (gama.getDescription() != null) {
                    gamaEncontrada.get().setDescription(gama.getDescription());
                }
                if (gama.getName() != null) {
                    gamaEncontrada.get().setName(gama.getName());
                }
                return gamaRepository.save(gamaEncontrada.get());
            }else {
                return gama;
            }
        }else {
            return gama;
        }
    }

    public boolean deleteGama (int id) {
        Boolean respuesta = getGama(id).map(gama -> {
            gamaRepository.delete(gama);
            return true;
        }).orElse(false);
        return respuesta;
    }
}
