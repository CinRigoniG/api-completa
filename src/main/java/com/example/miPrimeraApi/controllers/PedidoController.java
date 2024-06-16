package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Pedido>> listarPorCliente(@PathVariable Long id) throws Exception {
        List<Pedido> pedidos = pedidoService.listarPorCliente(id);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<List<Pedido>> listarPorEmpleado(@PathVariable Long id) throws Exception {
        List<Pedido> pedidos = pedidoService.listarPorEmpleado(id);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Pedido>> listarPorSucursal(@PathVariable Long id) throws Exception {
        List<Pedido> pedidos = pedidoService.listarPorSucursal(id);
        return ResponseEntity.ok(pedidos);
    }

}
