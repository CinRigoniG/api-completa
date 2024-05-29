package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.services.DetallePedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle-pedidos")
public class DetallePedidoController extends BaseController<DetallePedido, Long> {

    public DetallePedidoController(DetallePedidoService detallePedidoService){
        super(detallePedidoService);
    }

}
