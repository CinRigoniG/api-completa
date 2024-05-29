package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Pais;
import com.example.miPrimeraApi.repositories.PaisRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends BaseService<Pais, Long> {

    public PaisService(PaisRepository paisRepository){
        super(paisRepository);
    }

}
