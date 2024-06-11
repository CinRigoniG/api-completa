package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }

    @Transactional
    public List<ArticuloManufacturado> listarPorCategoria(Long categoriaId) throws Exception {
        try{
            return articuloManufacturadoRepository.findAllByCategoriaId(categoriaId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
