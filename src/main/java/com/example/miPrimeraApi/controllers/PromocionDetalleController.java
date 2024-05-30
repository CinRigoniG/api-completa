package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.services.PromocionDetalleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion-detalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long> {

    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }

}
