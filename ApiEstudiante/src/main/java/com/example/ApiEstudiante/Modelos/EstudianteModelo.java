package com.example.ApiEstudiante.Modelos;

import org.springframework.data.annotation.Id;


public class EstudianteModelo {
    @Id
    private long documento;
        
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String carrera;
    private String semestre;
    
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public long getDocumento() {
        return documento;
    }
    public void setDocumento(long documento) {
        this.documento = documento;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

}
