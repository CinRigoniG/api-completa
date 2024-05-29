package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagenService extends BaseService<Imagen, Long>{

    public ImagenService(ImagenRepository imagenRepository){
        super(imagenRepository);
    }

}
