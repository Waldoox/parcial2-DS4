package com.example.parcial3.Models;

public class Colaboradores {
    private int id_Colaborador;
    private String Nombre;

    public Colaboradores(int id_Colaborador, String Nombre){
        this.id_Colaborador = id_Colaborador;
        this.Nombre = Nombre;
    }

    public Colaboradores(){}

    public int getId_Colaboradores(){
        return id_Colaborador;
    }

    public void setId_Colaboradores(int id_Colaborador){
        this.id_Colaborador = id_Colaborador;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
}


