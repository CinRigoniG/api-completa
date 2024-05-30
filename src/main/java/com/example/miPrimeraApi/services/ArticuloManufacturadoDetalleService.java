package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoDetalleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }

}
