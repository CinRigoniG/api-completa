package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{

    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }

    @GetMapping("/domicilios/{id}")
    public ResponseEntity<List<Domicilio>> listarDomiciliosPorCliente(@PathVariable Long id) throws Exception {
        List<Domicilio> domicilios = clienteService.listarDomiciliosPorCliente(id);
        return ResponseEntity.ok(domicilios);
    }

}
