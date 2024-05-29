package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Usuario;
import com.example.miPrimeraApi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService extends BaseService<Usuario, Long> {

    public UsuarioService(UsuarioRepository usuarioRepository){
        super(usuarioRepository);
    }

}
