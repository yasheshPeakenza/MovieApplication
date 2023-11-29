package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @PostMapping ("/addMovies")
    public Movie addMovies(@RequestBody Movie movie){
        return movieServices.addMovie(movie);
    }

    @GetMapping("/allMovies")
    public List<Movie> allMovies (){
        return (List<Movie>) movieServices.getAllMovies();
    }
    @GetMapping("/moviesById/{id}")
    public Optional<Movie> moviesById (@PathVariable Long id)
    {
        return movieServices.moviesById(id);
    }

    @GetMapping("/productions/{id}")
    public List<Movie> allMoviesOfProduction(@PathVariable long id){
        return (List<Movie>) movieServices.getAllMoviesOfProduction(id);
    }
}
