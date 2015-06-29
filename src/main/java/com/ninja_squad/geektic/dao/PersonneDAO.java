package com.ninja_squad.geektic.dao;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.objets.Personne;

@Repository 
public class PersonneDAO {
	
	@PersistenceContext
    private EntityManager em;
	
    public List<Personne> getAll() {
        String jpql = "SELECT p FROM Personne p ";
        TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
        return query.getResultList();
    }
    
	public List<Personne> findByNom(String nom) {
		String jpql = "SELECT p FROM Personne p WHERE p.per_nom = 'Quatiglininini'";
			//	+ ""+nom+"'"  ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
		return query.getResultList();	
	}

	public List<Personne> findByPrenom(String prenom) {
		String jpql = "SELECT p FROM Personne p WHERE p.per_prenom = '"+prenom+"'"  ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
		return query.getResultList();
	}

	public List<Personne> findByInteret(String centreInteret) {
		String jpql = "SELECT p FROM Per_int pint "
				+ "INNER JOIN pint.Personne p "
				+ "INNER JOIN pint.Interets i "
				+ "WHERE i.type_interet = "+centreInteret ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
		return query.getResultList();	
	}
}
