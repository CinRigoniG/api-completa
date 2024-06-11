package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long>{

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try{

            List<DetallePedido> detallePedidos = detallePedidoService.listarPorPedido(pedido.getId());
            Double total = 0.0;

            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(detalle -> detalle.getSubTotal())
                        .sum();
            }

            pedido.setTotal(total);
            return pedidoRepository.save(pedido);

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido crear(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
