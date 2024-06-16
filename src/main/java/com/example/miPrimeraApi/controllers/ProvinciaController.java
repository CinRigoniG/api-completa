package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    @Autowired
    private ProvinciaService provinciaService;

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }

    @GetMapping("/pais/{id}")
    public ResponseEntity<List<Provincia>> listarPorPais(@PathVariable Long id) throws Exception {
        List<Provincia> provincias = provinciaService.listarPorPais(id);
        return ResponseEntity.ok(provincias);
    }

}
