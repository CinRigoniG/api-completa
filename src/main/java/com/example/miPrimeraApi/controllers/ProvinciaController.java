package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.services.ProvinciaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }

}
