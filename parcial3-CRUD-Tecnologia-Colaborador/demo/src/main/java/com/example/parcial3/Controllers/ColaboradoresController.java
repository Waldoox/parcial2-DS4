package com.example.parcial3.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcial3.Models.Colaboradores;
import com.example.parcial3.Services.ColaboradoresDB;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ColaboradoresController {

  @GetMapping("/Colaboradores/all")
  public List<Colaboradores> ObtenerTodosColaboradores() {
    return new ColaboradoresDB().ObtenerColaboradores();
  }

  
}