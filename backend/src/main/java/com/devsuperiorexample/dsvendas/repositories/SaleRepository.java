package com.devsuperiorexample.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorexample.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}