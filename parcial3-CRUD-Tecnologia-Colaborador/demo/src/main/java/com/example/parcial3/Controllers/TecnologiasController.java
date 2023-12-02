package com.example.parcial3.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcial3.Models.Tecnologias;
import com.example.parcial3.Services.TecnologiasDB;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TecnologiasController {

  @GetMapping("/Tecnologias/all")
  public List<Tecnologias> ObtenerTodasTecnologias() {
    return new TecnologiasDB().ObtenerTecnologias();
  }

}