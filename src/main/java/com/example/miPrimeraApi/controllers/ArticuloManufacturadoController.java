package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulo-manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long> {

    @Autowired
    private ArticuloManufacturadoService articuloManufacturadoService;

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }

    @GetMapping("/categoria/{cat_id}")
    public List<ArticuloManufacturado> listarPorCategoria(@PathVariable Long cat_id) throws Exception {
        return articuloManufacturadoService.listarPorCategoria(cat_id);
    }

}
