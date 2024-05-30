package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.services.ArticuloManufacturadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }

}
