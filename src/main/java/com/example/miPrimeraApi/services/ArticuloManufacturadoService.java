package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }

}
