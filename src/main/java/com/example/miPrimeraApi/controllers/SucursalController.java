package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.services.SucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

}
