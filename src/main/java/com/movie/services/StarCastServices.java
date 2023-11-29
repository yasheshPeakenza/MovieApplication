package com.movie.services;

import com.movie.entity.Movie;
import com.movie.entity.Starcast;
import com.movie.repository.MovieRepo;
import com.movie.repository.StarCastRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarCastServices {

    @Autowired
    StarCastRepo starCastRepo;
    @Autowired
    MovieRepo movieRepo;

    public Starcast addStarCast(Starcast starCast) {
         return starCastRepo.save(starCast);
    }

    public List<Movie> getMovieByStarCast(long id) {
       // return movieRepo.findAllById(id);
        return movieRepo.findAllById(id);
    }

   /* //public List<Movie> getMovieByStarCastName(String starName) {
       // return movieRepo.findBystarName(starName);
        //return starCastRepo.findBystarName(starName);
   // }*/
}
