package com.movie.repository;
import com.movie.entity.Starcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarCastRepo extends JpaRepository<Starcast,Long> {
    void findBystarName(String starName);
}
