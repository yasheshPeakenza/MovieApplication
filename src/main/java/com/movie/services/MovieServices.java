package com.movie.services;

import com.movie.entity.Movie;
import com.movie.entity.Production;
import com.movie.repository.MovieRepo;
import com.movie.repository.ProductionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServices {

    @Autowired
    MovieRepo movieRepo;

    @Autowired
    ProductionRepo productionRepo;

    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }

    public List<Movie> getAllMovies()

    {
      return (List<Movie>) movieRepo.findAll();
    }


    public Optional<Movie> moviesById(long id) {
        return movieRepo.findById(id);
    }

    public List<Movie> getAllMoviesOfProduction(Long id) {
        Optional<Production> id1=productionRepo.findById(id);
        return (List<Movie>) movieRepo.findAllById(id1);
    }
}
