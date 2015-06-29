package com.ninja_squad.geektic.dao;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.objets.Personne;

@Repository 
public class PersonneDAO {
	
	@PersistenceContext
    private EntityManager em;
	
    public List<Personne> getAll() {
        String jpql = "SELECT s FROM Personne s ";
        TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
        return query.getResultList();
    }
	
}
