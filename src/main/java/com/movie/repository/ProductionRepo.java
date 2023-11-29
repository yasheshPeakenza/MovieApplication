package com.movie.repository;
import com.movie.entity.Movie;
import com.movie.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepo extends JpaRepository<Production,Long> {
    Movie findAllById(Long id);
}
