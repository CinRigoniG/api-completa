package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.services.ArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulo-insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoService articuloInsumoService;

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }

    @GetMapping("/categoria/{cat_id}")
    public List<ArticuloInsumo> listarPorCategoria(@PathVariable Long cat_id) throws Exception {
        return articuloInsumoService.listarPorCategoria(cat_id);
    }

}
