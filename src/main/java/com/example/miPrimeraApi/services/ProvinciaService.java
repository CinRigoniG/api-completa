package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.repositories.ProvinciaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService extends BaseService<Provincia, Long> {

    public ProvinciaService(ProvinciaRepository provinciaRepository){
        super(provinciaRepository);
    }

}
