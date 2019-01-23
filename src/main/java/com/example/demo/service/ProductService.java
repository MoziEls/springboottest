package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ColorSwatches;
import com.example.demo.model.Product;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class ProductService {
 public static final String BR_POUND= "\u00A3";
 private RestTemplate restTemplate;

 private String uri="https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";

	   @Autowired
	   public ProductService(RestTemplateBuilder builder) {
	       this.restTemplate = builder.build();
	   }
	   public Product getProductsList(Optional<String> labelType)
	       {
	           Product response = restTemplate.getForObject(uri,Product.class);
	           System.out.println(response.getProductId());
			return response;
	          
			
	       }
	   private ArrayList<Product> JsonParser(Product response, Optional<String> labelType)
	   {
	       JsonFactory jsonFactory = new JsonFactory();

	       ObjectMapper objectMapper = new ObjectMapper(jsonFactory);

	       String productId = null;
	       String title = null;
	       ArrayList<ColorSwatches> color= new ArrayList<ColorSwatches>();
	       String skuid = null;
	       String nowPrice = null;
	       String label = null;



	       ArrayList<Product> productList = new ArrayList<Product>();
		return productList;
	       
	}}


	
		

