package com.ninja_squad.geektic.objets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Interets")
public class Interets {
	@Id
	@Column(name="Interet_id")
	private Long id; 
	
	@Column(name="type_interet")
	private String centreInteret;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the centreInteret
	 */
	public String getCentreInteret() {
		return centreInteret;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param centreInteret the centreInteret to set
	 */
	public void setCentreInteret(String centreInteret) {
		this.centreInteret = centreInteret;
	}
}

