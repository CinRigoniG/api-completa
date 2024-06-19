package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.repositories.BaseRepository;
import com.example.miPrimeraApi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }

    @Transactional
    public List<Domicilio> listarDomiciliosPorCliente(Long idCliente) throws Exception {
        try{
            List<Domicilio> domicilios = new ArrayList<>();
            Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
            if(cliente != null){
                domicilios = new ArrayList<>(cliente.getDomicilios());
            }
            return domicilios;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
