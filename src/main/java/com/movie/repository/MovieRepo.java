package com.movie.repository;

import com.movie.entity.Movie;
import com.movie.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {
    List<Movie> findAllById(Optional<Production> id);

    List<Movie> findAllById(long id);
}
