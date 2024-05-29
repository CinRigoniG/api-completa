package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria extends Base{

    private String denominacion;

    @OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

}
