package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long> {

    public EmpleadoController(EmpleadoService empleadoService){
        super(empleadoService);
    }

}
