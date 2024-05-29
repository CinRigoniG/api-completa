package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Usuario;
import com.example.miPrimeraApi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long> {

    public UsuarioController(UsuarioService usuarioService){
        super(usuarioService);
    }

}
