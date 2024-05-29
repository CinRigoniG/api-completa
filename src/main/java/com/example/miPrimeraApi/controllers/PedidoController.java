package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

}
