package pe.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.cinema.entity.Pelicula;



public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer>{

}
