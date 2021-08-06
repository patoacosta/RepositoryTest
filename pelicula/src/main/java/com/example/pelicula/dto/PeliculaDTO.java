package com.example.pelicula.dto;


import com.example.pelicula.model.PeliculaModel;

public class PeliculaDTO{
    private Integer id_pelicula;
    private String nombre_pelicula;
    private String imagenes_pelicula;
    private Integer duracion_pelicula;
    private Character clasificacion_pelicula;
    private Boolean status_pelicula;

    public PeliculaDTO() {
    }

    public PeliculaDTO(Integer id_pelicula, String nombre_pelicula, String imagenes_pelicula, Integer duracion_pelicula, Character clasificacion_pelicula, Boolean status_pelicula) {
        this.id_pelicula = id_pelicula;
        this.nombre_pelicula = nombre_pelicula;
        this.imagenes_pelicula = imagenes_pelicula;
        this.duracion_pelicula = duracion_pelicula;
        this.clasificacion_pelicula = clasificacion_pelicula;
        this.status_pelicula = status_pelicula;
    }

    public PeliculaDTO(PeliculaModel pelicula) {
        this.id_pelicula = pelicula.getId_pelicula();
        this.nombre_pelicula = pelicula.getNombre_pelicula();
        this.imagenes_pelicula = pelicula.getImagen_pelicula();
        this.duracion_pelicula = pelicula.getDuracion_pelicula();
        this.clasificacion_pelicula = pelicula.getClasificacion_pelicula();
        this.status_pelicula = pelicula.getStatus_pelicula();

    }

    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getImagenes_pelicula() {
        return imagenes_pelicula;
    }

    public void setImagenes_pelicula(String imagenes_pelicula) {
        this.imagenes_pelicula = imagenes_pelicula;
    }

    public Integer getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_pelicula(Integer duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public Character getClasificacion_pelicula() {
        return clasificacion_pelicula;
    }

    public void setClasificacion_pelicula(Character clasificacion_pelicula) {
        this.clasificacion_pelicula = clasificacion_pelicula;
    }

    public Boolean getStatus_pelicula() {
        return status_pelicula;
    }

    public void setStatus_pelicula(Boolean status_pelicula) {
        this.status_pelicula = status_pelicula;
    }
}
