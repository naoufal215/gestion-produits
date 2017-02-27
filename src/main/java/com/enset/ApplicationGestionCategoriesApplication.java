package com.enset;

import com.enset.dao.ProduitRepository;
import com.enset.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationGestionCategoriesApplication  implements CommandLineRunner{
	@Autowired
	private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApplicationGestionCategoriesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		/*produitRepository.save(new Produit("telephone",900,6));
		produitRepository.save(new Produit("tv",1123,60));
		produitRepository.save(new Produit("pc",4887,16));
		produitRepository.save(new Produit("tablette",632,236));*/
	}
}
