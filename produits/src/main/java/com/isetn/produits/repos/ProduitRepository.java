package com.isetn.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isetn.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	

}
