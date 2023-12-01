package com.example.Juan.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.Juan.Models.Imagenes;

public class ImagenesDb {
    Connection cn;

    public ImagenesDb() {
        cn = new com.example.Juan.Conexion().openDb();
    }

    public List<Imagenes> ObtenerImagenes() {
        try {
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM imagenes";

            List<Imagenes> imagenes = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                Imagenes imagen = new Imagenes(
                        result.getInt("id_img"),
                        result.getString("foto")
                );

                imagenes.add(imagen);
            }

            result.close();
            stmt.close();
            return imagenes;

        } catch (Exception e) {
            int x = 1;
        }
        return null;
    }

}
