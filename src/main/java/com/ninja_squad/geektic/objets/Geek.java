package com.ninja_squad.geektic.objets;

public class Geek extends Personne{
	private int nbCharmesEnvoye;
	private int nbCharmesRestant;
	private int affinite; 
	private Sexe interessePar;
	
	private Geek(String nom, String prenom, int age, String email,String motDePasse,Sexe interet){
		super(nom,prenom,age,email, motDePasse);
	}
}
