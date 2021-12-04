package com.example.ApiEstudiante.Repositorios;

import java.util.ArrayList;

import com.example.ApiEstudiante.Modelos.EstudianteModelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends MongoRepository<EstudianteModelo,Long> {
    ArrayList<EstudianteModelo> findByNombres(String nombres);
}
