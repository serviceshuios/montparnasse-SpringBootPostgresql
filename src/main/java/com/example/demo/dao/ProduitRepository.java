package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.metier.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
