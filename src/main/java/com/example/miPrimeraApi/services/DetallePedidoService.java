package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.repositories.DetallePedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long> {

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository){
        super(detallePedidoRepository);
    }

}
