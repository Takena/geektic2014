package com.ninja_squad.geektic.objets;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Personne")

public class Personne {
	
	@Id
    // name correspond au nom de la séquence utilisée
    // sequenceName est le nom de la séquence utilisé dans la BDD
   // @SequenceGenerator(name = "seq", sequenceName = "personne_seq")
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Column(name = "personne_id")
	protected Long id; 
	@Column(name = "per_nom")
	protected String nom;
	@Column(name = "per_prenom")
	protected String prenom;
	@Column(name = "email")
	protected String email;
	@Column(name = "motdepasse")
	protected String motDepasse;
	@Column(name = "genre")
	@Enumerated(EnumType.STRING)
	protected Sexe genre;
	@Column(name = "age")
	protected int age;
	@Column(name = "nbvisiteprofil")
	protected int nbVisiteProfil;
	@Column(name = "charmesenvoye")
	protected int nbCharmesEnvoye;
	@Column(name = "charmesrecu")
	protected int nbCharmesRecu;
	@Column(name = "charmesrestant")
	protected int nbCharmesRestant; 
	
	@ManyToMany
	  @JoinTable
	  (
	      name="PER_INT",
	      joinColumns={ @JoinColumn(name="PERSONNE_ID") },
	      inverseJoinColumns={ @JoinColumn(name="INTERETS_ID") }
	  )
	 private List<Interets> listeCentreInteret;
	 //TODO : protected List<Interets> listeInteret; 
	
	
	/**
	 * @return the listeCentreInteret
	 */
	public List<Interets> getListeCentreInteret() {
		return listeCentreInteret;
	}

	/**
	 * @param listeCentreInteret the listeCentreInteret to set
	 */
	public void setListeCentreInteret(List<Interets> listeCentreInteret) {
		this.listeCentreInteret = listeCentreInteret;
	}

	public Personne(String nom, String prenom, int age,Sexe genre, String email, String motdepasse){
		
		this.nom = nom; 
		this.prenom = prenom;
		this.motDepasse = motdepasse; 
		this.genre = genre; 
		this.email = email; 
		this.age = age; 
		this.nbVisiteProfil = 0; 
		this.nbCharmesEnvoye = 0;
		this.nbCharmesRecu = 0 ; 
		
		//Pour tous les nouveaux utilisateurs, 10 charmes sont offerts. 
		this.nbCharmesRestant = 10; 
	}
	
	public Personne(){
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the motDepasse
	 */
	public String getMotDepasse() {
		return motDepasse;
	}

	/**
	 * @return the genre
	 */
	public Sexe getGenre() {
		return genre;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the nbVisiteProfil
	 */
	public int getNbVisiteProfil() {
		return nbVisiteProfil;
	}

	/**
	 * @return the nbCharmesEnvoye
	 */
	public int getNbCharmesEnvoye() {
		return nbCharmesEnvoye;
	}

	/**
	 * @return the nbCharmesRecu
	 */
	public int getNbCharmesRecu() {
		return nbCharmesRecu;
	}

	/**
	 * @return the nbCharmesRestant
	 */
	public int getNbCharmesRestant() {
		return nbCharmesRestant;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param motDepasse the motDepasse to set
	 */
	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Sexe genre) {
		this.genre = genre;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param nbVisiteProfil the nbVisiteProfil to set
	 */
	public void setNbVisiteProfil(int nbVisiteProfil) {
		this.nbVisiteProfil = nbVisiteProfil;
	}

	/**
	 * @param nbCharmesEnvoye the nbCharmesEnvoye to set
	 */
	public void setNbCharmesEnvoye(int nbCharmesEnvoye) {
		this.nbCharmesEnvoye = nbCharmesEnvoye;
	}

	/**
	 * @param nbCharmesRecu the nbCharmesRecu to set
	 */
	public void setNbCharmesRecu(int nbCharmesRecu) {
		this.nbCharmesRecu = nbCharmesRecu;
	}

	/**
	 * @param nbCharmesRestant the nbCharmesRestant to set
	 */
	public void setNbCharmesRestant(int nbCharmesRestant) {
		this.nbCharmesRestant = nbCharmesRestant;
	}
}
