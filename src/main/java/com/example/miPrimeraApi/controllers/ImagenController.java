package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, Long> {

    public ImagenController(ImagenService imagenService){
        super(imagenService);
    }

}
