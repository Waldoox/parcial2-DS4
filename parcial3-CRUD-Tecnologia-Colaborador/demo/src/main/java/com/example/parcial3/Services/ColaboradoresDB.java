package com.example.parcial3.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.parcial3.Models.Colaboradores;

public class ColaboradoresDB {
  Connection _cn;

  public ColaboradoresDB() {
    _cn = new ConexionDB().openDb();
  }

  public List<Colaboradores> ObtenerColaboradores() {
    try {
      Statement stmt = _cn.createStatement();
      String query = "SELECT * FROM Colaboradores";

      List<Colaboradores> Colaboradores = new ArrayList<>();
      ResultSet result = stmt.executeQuery(query);
      while (result.next()) {
        Colaboradores colaboradores = new Colaboradores(
            result.getInt("ID_Colaborador"),
            result.getString("Nombre")
        );
        Colaboradores.add(colaboradores);
      }

      result.close();
      stmt.close();
      return Colaboradores;

    } catch (Exception e) {
      int x = 1;
    }
    return null;
  }
}
