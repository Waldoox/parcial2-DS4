package com.example.parcial3.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.example.parcial3.Models.Tecnologias;

public class TecnologiasDB {
  Connection _cn;

  public TecnologiasDB() {
    _cn = new ConexionDB().openDb();
  }

  public List<Tecnologias> ObtenerTecnologias() {
    try {
        Statement stmt = _cn.createStatement();
        String query = "SELECT * FROM Tecnologias";

        List<Tecnologias> tecnologiasList = new ArrayList<>();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            Tecnologias tecnologia = new Tecnologias(
                    result.getInt("ID_Tecnologia"),
                    result.getString("Nombre"),
                    result.getString("Descripcion"),
                    result.getString("Imagen")
            );
            tecnologiasList.add(tecnologia);
        }

        result.close();
        stmt.close();
        return tecnologiasList;

    } catch (Exception e) {
        e.printStackTrace(); // Se recomienda imprimir la excepción para obtener detalles del error
    }
    return null;
}
}
