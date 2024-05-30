package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.repositories.PromocionDetalleRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long> {

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository){
        super(promocionDetalleRepository);
    }

}
