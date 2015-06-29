package com.ninja_squad.geektic.objets;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String email;
	protected String motDepasse;
	protected Sexe genre;
	protected int age; 
	protected int nbVisiteProfil; 
	
	public Personne(String nom, String prenom, int age, String email, String motdepasse){
		this.nom = nom; 
		this.prenom = prenom;
		this.motDepasse = motdepasse; 
		this.email = email; 
		this.age = age; 
		this.nbVisiteProfil = 0; 
	}
}
