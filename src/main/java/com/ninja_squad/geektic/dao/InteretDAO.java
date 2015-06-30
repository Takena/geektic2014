package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.objets.Interets;

@Repository
public class InteretDAO {
	
	@PersistenceContext
    private EntityManager em;
	
	public List<Interets> getAll() {
	        String jpql = "SELECT i FROM Interets i ";
	        TypedQuery<Interets> query = em.createQuery(jpql, Interets.class);
	        return query.getResultList();
	   }
}
