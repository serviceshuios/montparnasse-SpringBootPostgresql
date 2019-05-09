package com.example.demo.service;

import java.util.List;

import com.example.demo.metier.Produit;

public interface Iservice {

	public void ajouterProduit(Produit p);
	public List<Produit> listerProduits();
	public void supprimerProduit(long idProduit);
	public Produit getProduit(long idProduit);
}
