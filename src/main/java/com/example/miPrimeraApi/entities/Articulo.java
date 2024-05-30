package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class Articulo extends Base{

    protected String denominacion;
    @Column(name = "precio_venta")
    protected Double precioVenta;

    @OneToMany
    @Builder.Default
    private Set<Imagen> imagenesArticulos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;

}