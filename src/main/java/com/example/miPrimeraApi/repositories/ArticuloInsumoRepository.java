package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long> {

    List<ArticuloInsumo> findAllByCategoriaId(Long categoriaId);

}
