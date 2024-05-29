package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.services.LocalidadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    public LocalidadController(LocalidadService localidadService){
        super(localidadService);
    }

}
