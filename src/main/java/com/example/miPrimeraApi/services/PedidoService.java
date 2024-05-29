package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long>{

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

}
