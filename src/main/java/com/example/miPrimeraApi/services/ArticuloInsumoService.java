package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.repositories.ArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository){
        super(articuloInsumoRepository);
    }

    @Transactional
    public List<ArticuloInsumo> listarPorCategoria(Long categoriaId) throws Exception {
        try{
            return articuloInsumoRepository.findAllByCategoriaId(categoriaId);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
