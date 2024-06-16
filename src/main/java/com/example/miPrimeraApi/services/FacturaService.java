package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Factura;
import com.example.miPrimeraApi.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaService extends BaseService<Factura,Long> {

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository){
        super(facturaRepository);
    }

    @Transactional
    public Factura listarPorPedido(Long idPedido) throws Exception {
        try{
            return facturaRepository.findByPedidoId(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
