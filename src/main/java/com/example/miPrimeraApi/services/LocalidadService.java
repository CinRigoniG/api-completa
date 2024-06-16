package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocalidadService extends BaseService<Localidad, Long> {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(LocalidadRepository localidadRepository){
        super(localidadRepository);
    }

    @Transactional
    public List<Localidad> listarPorProvincia(Long idProvincia) throws Exception {
        try{
            return localidadRepository.findAllByProvinciaId(idProvincia);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
