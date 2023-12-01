package com.example.Juan.Models;

public class Imagenes {
    private int id_img;
    private String foto;

    public Imagenes(int id_img, String foto) {
        this.id_img = id_img;
        this.foto = foto;
    }

    public Imagenes() {
    }

    public int getId_img() {
        return id_img;
    }

    public void setId_img(int id_img) {
        this.id_img = id_img;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}