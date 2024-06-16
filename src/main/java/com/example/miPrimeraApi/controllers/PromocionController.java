package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.services.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long> {

    @Autowired
    private PromocionService promocionService;

    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Promocion>> listarPorSucursal(@PathVariable Long id) throws Exception {
        List<Promocion> promociones = promocionService.listarPorSucursal(id);
        return ResponseEntity.ok(promociones);
    }

}
