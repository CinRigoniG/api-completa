package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class CategoriaService extends BaseService<Categoria, Long> {

    public CategoriaService(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
    }

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public Categoria agregarSubcategoria(Long idCategoriaPadre, Categoria nuevaSubcategoria) throws Exception {
        try {
            // Obtener la categoría existente
            Categoria categoriaPadre = categoriaRepository.findById(idCategoriaPadre).orElseThrow(() -> new Exception("La categoría padre no se encontró"));

            // Establecer la categoría existente como padre de la nueva subcategoría
            nuevaSubcategoria.setCategoriaPadre(categoriaPadre);

            // Guardar la nueva subcategoría
            categoriaRepository.save(nuevaSubcategoria);

            // Agregar la nueva subcategoría a la lista de subcategorías de la categoría existente
            categoriaPadre.getSubcategorias().add(nuevaSubcategoria);
            // Guardar la categoría existente con la nueva subcategoría
            categoriaRepository.save(categoriaPadre);

            return categoriaPadre;
        } catch (Exception e) {
            // Manejar cualquier excepción capturada
            throw new Exception(e.getMessage());
        }
    }

}
