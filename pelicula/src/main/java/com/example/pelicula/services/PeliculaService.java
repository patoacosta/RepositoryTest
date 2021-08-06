package com.example.pelicula.services;

import com.example.pelicula.dto.PeliculaDTO;
import com.example.pelicula.model.PeliculaModel;
import com.example.pelicula.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    public List<PeliculaDTO> listadoPelicula(){
        List<PeliculaModel> lista = peliculaRepository.findAll();

        List<PeliculaDTO> returnLista = new ArrayList<>();

        for(PeliculaModel it : lista)
            returnLista.add(new PeliculaDTO(it));

        return returnLista;

    }

    public PeliculaDTO guardarPelicula(PeliculaDTO datos) {
        PeliculaModel nuevaPelicula = new PeliculaModel();

        if (datos.getId_pelicula() != null) {
            nuevaPelicula = peliculaRepository.getById(datos.getId_pelicula());
            nuevaPelicula.setStatus_pelicula(datos.getStatus_pelicula());

        } else {
            nuevaPelicula.setStatus_pelicula(true);
        }

        nuevaPelicula.setNombre_pelicula(datos.getNombre_pelicula());
        nuevaPelicula.setImagen_pelicula(datos.getImagenes_pelicula());
        nuevaPelicula.setDuracion_pelicula(datos.getDuracion_pelicula());
        nuevaPelicula.setClasificacion_pelicula(datos.getClasificacion_pelicula());
        nuevaPelicula.setStatus_pelicula(datos.getStatus_pelicula());

        nuevaPelicula = peliculaRepository.save(nuevaPelicula);

        datos.setId_pelicula(nuevaPelicula.getId_pelicula());

        return datos;
    }


    public Boolean eliminarPelicula(PeliculaDTO datos){
        Optional<PeliculaModel> peliculaEncontrada = peliculaRepository.findById(datos.getId_pelicula());

        if (peliculaEncontrada.isPresent()){
            peliculaEncontrada.get().setStatus_pelicula(!peliculaEncontrada.get().getStatus_pelicula());

            peliculaRepository.save(peliculaEncontrada.get());
            return false;
        }

        return true;
    }

}
