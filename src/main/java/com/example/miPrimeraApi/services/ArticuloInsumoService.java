package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.repositories.ArticuloInsumoRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository){
        super(articuloInsumoRepository);
    }

}
