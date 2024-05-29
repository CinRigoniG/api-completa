package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
}
