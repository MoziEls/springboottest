package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;


@CrossOrigin
@RestController
@ResponseBody

public class Controller {
	ProductService ps;
	@Autowired
	   public Controller(ProductService ps) {
		super();
		this.ps = ps;
	}


	@GetMapping(value = "/products",produces="application/json")
    public Product getProducts(@RequestParam("labelType") Optional<String> labelType)
    {
        //System.out.println();
        return ps.getProductsList(labelType);
    }
	   }



