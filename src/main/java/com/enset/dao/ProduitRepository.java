package com.enset.dao;

import com.enset.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



/**
 * Created by naoufal on 24/02/2017.
 */
public interface ProduitRepository  extends JpaRepository<Produit,Long> {
    @Query("select p from Produit p where p.designation like :x")
    Page<Produit> chercherProduits(@Param("x") String Designation, Pageable pageable);
}
