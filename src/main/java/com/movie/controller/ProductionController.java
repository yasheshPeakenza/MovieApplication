package com.movie.controller;

import com.movie.entity.Production;
import com.movie.services.ProductionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductionController {

    @Autowired
    ProductionServices productionServices;

    @PostMapping("/addProduction")
    public Production addProduction(@RequestBody Production production){
        return productionServices.addProduction(production);
    }
}
