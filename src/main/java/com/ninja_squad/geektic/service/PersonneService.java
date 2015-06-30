package com.ninja_squad.geektic.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja_squad.geektic.dao.PersonneDAO;
import com.ninja_squad.geektic.objets.Personne;

@Service
public class PersonneService {

    private PersonneDAO dao;

    @Autowired
    public PersonneService(PersonneDAO _dao) {
        dao = _dao;
    }

    public List<Personne> listeUtilisateur() {
    	System.out.print(dao.getAll());
    	return dao.getAll();     
    }
    
    public List<Personne> listeUtilisateurByGenderAndCenter(String gender, String centreInteret) {
    
    	return dao.findByGenderInterest(gender, centreInteret);
         
    }

    
}
