package com.movie.services;

import com.movie.entity.Production;

import com.movie.repository.ProductionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ProductionServices {

    @Autowired
    ProductionRepo productionRepo;

    public Production addProduction(Production production) {
       return productionRepo.save(production);
    }
}
