package com.ninja_squad.geektic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.InteretDAO;
import com.ninja_squad.geektic.objets.Interets;

	@RestController
	@Transactional
	@RequestMapping("api/centreInteret")
	public class InteretService {

		@Autowired
	    private InteretDAO dao;
		
		@RequestMapping(method = RequestMethod.GET)
	    public List<Interets> getAllInterets()
	    {
	        return dao.getAll();
	    }
}
