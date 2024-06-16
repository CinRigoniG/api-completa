package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

    @Transactional
    public List<Domicilio> listarPorLocalidad(Long idLocalidad) throws Exception {
        try{
            return domicilioRepository.findAllByLocalidadId(idLocalidad);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }

    }

}
