package com.ninja_squad.geektic.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ninja_squad.geektic.objets.Interets;
import com.ninja_squad.geektic.service.InteretService;


@Component
@Controller
@RequestMapping("/api/Interets")
public class InteretsController {

   private InteretService service;

    @Autowired
   public InteretsController(InteretService service) {
        this.service = service;
    }
    
    @RequestMapping (method =RequestMethod.GET)
    @ResponseBody
    @Transactional
    public List<Interets> view(){
		return service.getAllInterets();
    }
}
