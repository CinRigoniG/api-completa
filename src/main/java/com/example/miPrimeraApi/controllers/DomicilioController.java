package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.services.DomicilioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long> {

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

}
