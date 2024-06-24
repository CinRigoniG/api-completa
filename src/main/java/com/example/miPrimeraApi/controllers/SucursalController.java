package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    @Autowired
    private SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity<List<Categoria>> listarCategoriaPorSucursal(@PathVariable Long id) throws Exception {
        List<Categoria> categorias = sucursalService.listarCategoriaPorSucursal(id);
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/promociones/{id}")
    public ResponseEntity<List<Promocion>> listarPromocionPorSucursal(@PathVariable Long id) throws Exception {
        List<Promocion> promociones = sucursalService.listarPromocionPorSucursal(id);
        return ResponseEntity.ok(promociones);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Sucursal>> listarPorEmpresa(@PathVariable Long id) throws Exception {
        List<Sucursal> sucursales = sucursalService.listarPorEmpresa(id);
        return ResponseEntity.ok(sucursales);
    }

}
