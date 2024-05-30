package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.services.ArticuloInsumoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }

}
