package com.movie.controller;

import com.movie.entity.Movie;
import com.movie.entity.Starcast;
import com.movie.services.StarCastServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class StarCastController {

    @Autowired
    StarCastServices starCastServices;

    @PostMapping("/addStarCast")
    public Starcast addStarCast(@RequestBody Starcast starcast){
        return starCastServices.addStarCast(starcast);
    }

   /* @GetMapping("/starCastAllMovies")
    public StarCast getMovieByStarCastName(@RequestParam String starName){
        return starCastServices.getMovieByStarCastName(starName);
    }*/
    @GetMapping("/starCastAllMovies/{id}")
    public List<Movie> getMovieByStarCast(@PathVariable long id)
    {
        return starCastServices.getMovieByStarCast(id);
    }
}
