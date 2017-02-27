package com.enset.web;

import com.enset.dao.ProduitRepository;
import com.enset.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by naoufal on 24/02/2017.
 */
@RestController
public class ProduitRestService {
    @Autowired
    private ProduitRepository produitRepository;

    @RequestMapping(value = "/allProduits",method = RequestMethod.GET)
    public List<Produit> listeProduits(){
        return produitRepository.findAll();
    }
    @RequestMapping(value = "/produit/{id}",method = RequestMethod.GET)
    public Produit gitProduit(@PathVariable(name = "id") Long id){
        return produitRepository.findOne(id);
    }
    @RequestMapping(value = "/saveProduit",method = RequestMethod.POST)
    public Produit saveProduit(@RequestBody Produit produit){
        return produitRepository.save(produit);
    }
    @RequestMapping(value = "/UpdateProduit/{id}",method = RequestMethod.PUT)
    public Produit UpdateProduit(@PathVariable(name="id") Long id,@RequestBody Produit produit){
        produit.setId(id);
        return produitRepository.save(produit);
    }
    @RequestMapping(value = "/findProduits",method = RequestMethod.GET)
    public Page<Produit> findProduits(@RequestParam(value = "mc",defaultValue = "") String mc,
                                      @RequestParam(value = "page",defaultValue = "0") int page,
                                      @RequestParam(value = "size",defaultValue = "10") int size){
        return produitRepository.chercherProduits("%"+mc+"%",new PageRequest(page,size));
    }
}
