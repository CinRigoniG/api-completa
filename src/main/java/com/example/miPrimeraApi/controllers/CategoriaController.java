package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseController<Categoria, Long> {

    public CategoriaController(CategoriaService categoriaService){
        super(categoriaService);
    }

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/subcategoria/{id_CP}")
    public Categoria agregarSubcategoria(@PathVariable Long id_CP, @RequestBody Categoria subcategoria) throws Exception {
        Categoria catPadre = categoriaService.agregarSubcategoria(id_CP, subcategoria);
        return catPadre;
    }

}
