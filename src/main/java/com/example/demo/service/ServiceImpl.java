package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.metier.Produit;


@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private ProduitRepository produitRepository;

	public ProduitRepository getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	@Override
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		produitRepository.save(p);
	}

	@Override
	public List<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void supprimerProduit(long idProduit) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(idProduit);
	}

	@Override
	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return produitRepository.findById(idProduit).get();
	}


}
