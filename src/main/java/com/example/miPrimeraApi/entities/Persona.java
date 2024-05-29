package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    @Column(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    protected Rol rol;

    @OneToOne
    @JoinColumn(name = "imagen_id")
    protected Imagen imagenPersona;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    protected Usuario usuario;

}
