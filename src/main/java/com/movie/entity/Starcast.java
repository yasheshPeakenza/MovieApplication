package com.movie.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Starcast {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        long id;
        String starName;
        @ManyToMany
        @JoinTable(name="moviestarcast",
                joinColumns = @JoinColumn(name="starcast_id"),
                inverseJoinColumns =@JoinColumn(name = "movie_id"))
        private List<Movie> movies=new ArrayList<>();

    }
