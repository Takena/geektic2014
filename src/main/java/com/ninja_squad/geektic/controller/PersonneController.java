package com.ninja_squad.geektic.controller;

import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ninja_squad.geektic.objets.Personne;
import com.ninja_squad.geektic.service.PersonneService;

@Component
@Controller
@RequestMapping("/api/Personne")
public class PersonneController {

   private PersonneService service;

    @Autowired
   public PersonneController(PersonneService service) {
        this.service = service;
    }
    
    @RequestMapping (method =RequestMethod.GET)
    @ResponseBody
    @Transactional
    public List<Personne> view(){
		return service.listeUtilisateur();
    }
    
}

