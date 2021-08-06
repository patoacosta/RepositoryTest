package com.example.pelicula.controller;

import com.example.pelicula.dto.PeliculaDTO;
import com.example.pelicula.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/obtenerPelicula")
    public List<PeliculaDTO> obtenerPelicula(){return peliculaService.listadoPelicula();}

    @PostMapping("/guardarPelicula")
    public PeliculaDTO guardarPelicula(@RequestBody PeliculaDTO PeliculaNueva){return peliculaService.guardarPelicula(PeliculaNueva);}

    @PostMapping("/eliminarPelicula")
    public Boolean eliminarPelicula(@RequestBody PeliculaDTO datosNuevos){return peliculaService.eliminarPelicula(datosNuevos);}
}
