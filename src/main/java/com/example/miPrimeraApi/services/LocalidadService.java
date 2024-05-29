package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseService<Localidad, Long> {

    public LocalidadService(LocalidadRepository localidadRepository){
        super(localidadRepository);
    }

}
