package com.ninja_squad.geektic.objets;

public class Geekette extends Personne{
	private int popularite;
	private int nbCharmeRecu;
	private int affinite; 
	private Sexe interessePar;
	
	private Geekette(String nom, String prenom, int age, String email,String motDePasse, Sexe interet){
		super(nom,prenom,age,email, motDePasse);
		
		
	}
}
