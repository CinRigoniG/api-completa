package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

}
