package com.movie.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;
     String movieName;

    @ManyToMany(mappedBy ="movies")
   private List<Starcast> starcasts=new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "production-id")
    private Production production;


}
