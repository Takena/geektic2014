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
		String jpql = "SELECT p FROM Personne p WHERE p.per_nom = :nom"  ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
		return query.getResultList();	
	}

	public List<Personne> findByPrenom(String prenom) {
		String jpql = "SELECT p FROM Personne p WHERE p.per_prenom = :prenom"  ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class);
		return query.getResultList();
	}
	
	public List<Personne> findByGenderInterest(String gender,String centreInteret) {
		String jpql ="";
		if("undefined".equalsIgnoreCase(centreInteret)){
			if("undefined".equalsIgnoreCase(gender)){
				jpql = "SELECT p FROM Personne p ";			
			}
			else{
				jpql = "SELECT p FROM Personne p WHERE p.genre = :gender";
			}
		}
		else{
			if("undefined".equalsIgnoreCase(gender)){
				jpql = "SELECT p FROM Personne p "
						+ "INNER JOIN p.listeCentreInteret i "
						+ "WHERE i.centreInteret = :centreInteret" ;
			}
			else{
				jpql = "SELECT p FROM Personne p "
						+ "INNER JOIN p.listeCentreInteret i "
						+ "WHERE p.genre = :gender "
						+ "AND i.centreInteret = :centreInteret" ;
			}
		}
	
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class).setParameter("centreInteret", centreInteret).setParameter("genre", gender);
		return query.getResultList();
	}

	public List<Personne> findByInteret(String centreInteret) {
		String jpql = "SELECT p FROM Personne p "
				+ "INNER JOIN p.listeCentreInteret i "
				+ "WHERE i.centreInteret = :centreInteret" ;
		TypedQuery<Personne> query = em.createQuery(jpql, Personne.class).setParameter("centreInteret", centreInteret);
		return query.getResultList();	
	}
	
	
}
