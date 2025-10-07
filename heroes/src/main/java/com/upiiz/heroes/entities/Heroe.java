package com.upiiz.heroes.entities;

import jakarta.persistence.*;

@Entity
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String poder;
    private String universo;
    @Column(name = "url_imagen")
    private String urlImagen;

    public Heroe(Long id, String nombre, String poder, String universo, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
        this.universo = universo;
        this.urlImagen = urlImagen;
    }

    public Heroe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
