package com.example.ApiEstudiante.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiEstudiante.Modelos.EstudianteModelo;
import com.example.ApiEstudiante.Servicios.EstudianteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/estudiante")
public class EstudianteControlador {
    @Autowired
    EstudianteServicio servicio;

    @PostMapping
    public EstudianteModelo guardaEstudiante(@RequestBody EstudianteModelo estudiante){
        return servicio.guardaEstudiante(estudiante);
    }

    @GetMapping
    public ArrayList<EstudianteModelo> verEstudiantes(){
        return servicio.vEstudiantes();
    }
    @GetMapping(path = "/buscar/{id}")
    public Optional<EstudianteModelo> consultaPorId(@PathVariable("id") Long documento){
        return servicio.BuscarporId(documento);
    }
    
    @DeleteMapping(path ="/borrar/{id}")
    public boolean DeleteEstudiante(@PathVariable("id") Long documento) {
        return servicio.DeleteEstudiante(documento);
    }
    
    @GetMapping(path ="/buscar")
    public ArrayList<EstudianteModelo> BuscarPorN(String nombres){
        return servicio.BuscarPorN(nombres);
    }

    @PutMapping()
    public EstudianteModelo guardEstudiante(@RequestBody EstudianteModelo estudiante){
        return servicio.guardaEstudiante(estudiante);
    }
    
}
