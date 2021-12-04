package com.example.ApiEstudiante.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiEstudiante.Modelos.EstudianteModelo;
import com.example.ApiEstudiante.Repositorios.EstudianteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//metodo para guardar un estudiante
@Service
public class EstudianteServicio {
    
    @Autowired
    EstudianteRepositorio repositorio;

    
    public EstudianteModelo guardaEstudiante(EstudianteModelo estudiante){
        return repositorio.save(estudiante);
    }

    public ArrayList<EstudianteModelo> vEstudiantes(){
        return (ArrayList<EstudianteModelo>) repositorio.findAll();
    }
    public Optional<EstudianteModelo> BuscarporId(Long documento){
        return repositorio.findById(documento);
    }

    public ArrayList<EstudianteModelo> BuscarPorN(String nombres){
        return repositorio.findByNombres(nombres);
    }
    public boolean DeleteEstudiante(Long documento){
        if(repositorio.existsById(documento)){
            repositorio.deleteById(documento);
            return true;
        }
        else{
            return false;
        }
    }

}
