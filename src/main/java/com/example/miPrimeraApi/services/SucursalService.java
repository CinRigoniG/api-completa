package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

}
