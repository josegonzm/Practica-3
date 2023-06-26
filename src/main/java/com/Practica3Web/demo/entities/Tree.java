package com.Practica3Web.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "arbol")

public class Tree {

    @Id
    @Column(name = "id_arbol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name_arbol;
    private Integer precio;
    private String ruta_imagen;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_arbol() {
        return name_arbol;
    }

    public void setName_arbol(String name_arbol) {
        this.name_arbol = name_arbol;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
