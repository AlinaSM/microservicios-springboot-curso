package com.cursomicroservicios.cursomicroservicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursomicroservicios.cursomicroservicios.repositories.CustomerRepository;
import com.cursomicroservicios.cursomicroservicios.entities.Customer;;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired //Inyeccion de dependencias
    CustomerRepository customerRepository;
    
    @GetMapping()
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Customer input) {
        Customer customer = customerRepository.save(input);
        return ResponseEntity.ok(customer);
    }
}
