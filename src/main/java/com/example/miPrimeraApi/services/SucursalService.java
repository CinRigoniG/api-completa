package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

    @Transactional
    public List<Categoria> listarCategoriaPorSucursal(Long sucursalId) throws Exception {
        try{
            Sucursal sucursal = sucursalRepository.findById(sucursalId).orElse(null);
            return new ArrayList<>(sucursal.getCategorias());
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Sucursal> listarPorEmpresa(Long idEmpresa) throws Exception {
        try{
            return sucursalRepository.findAllByEmpresaId(idEmpresa);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
