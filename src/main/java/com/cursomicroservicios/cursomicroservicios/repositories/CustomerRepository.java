package com.cursomicroservicios.cursomicroservicios.repositories;

import com.cursomicroservicios.cursomicroservicios.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>   {
    
}
