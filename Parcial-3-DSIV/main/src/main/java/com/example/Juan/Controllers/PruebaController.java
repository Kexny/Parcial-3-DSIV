package com.example.Juan.Controllers;

import com.example.Juan.Models.Imagenes;
import com.example.Juan.Services.ImagenesDb;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PruebaController {

    @GetMapping("/imagenes")
    public List<Imagenes> ObtenerTodosImagenes() {
        return new ImagenesDb().ObtenerImagenes();
    }

}
