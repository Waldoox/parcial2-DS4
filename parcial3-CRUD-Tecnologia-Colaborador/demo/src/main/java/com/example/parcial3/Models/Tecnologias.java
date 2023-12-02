package com.example.parcial3.Models;

public class Tecnologias {

    private int idTecnologia;
    private String nombre;
    private String descripcion;
    private String imagen;

    // Constructor
    public Tecnologias(int idTecnologia, String nombre, String descripcion, String imagen) {
        this.idTecnologia = idTecnologia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Tecnologias(){}

    // Getter y Setter para idTecnologia
    public int getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(int idTecnologia) {
        this.idTecnologia = idTecnologia;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter y Setter para imagen
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}