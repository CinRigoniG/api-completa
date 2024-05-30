package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.services.ArticuloManufacturadoDetalleService;
import com.example.miPrimeraApi.services.ArticuloManufacturadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo-manufacturado-detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }

}
