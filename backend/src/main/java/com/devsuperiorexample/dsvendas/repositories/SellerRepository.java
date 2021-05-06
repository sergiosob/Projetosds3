package com.devsuperiorexample.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorexample.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
