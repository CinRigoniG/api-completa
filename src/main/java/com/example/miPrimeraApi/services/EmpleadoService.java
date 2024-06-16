package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long>{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository){
        super(empleadoRepository);
    }

    @Transactional
    public List<Empleado> listarPorSucursal(Long idSucursal) throws Exception {
        try{
            return empleadoRepository.findAllBySucursalId(idSucursal);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
