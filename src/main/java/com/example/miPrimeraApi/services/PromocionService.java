package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    @Autowired
    private PromocionRepository promocionRepository;

    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }

}
