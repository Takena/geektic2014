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
	private Long Id; 
	
	@Column(name="type_interet")
	private String centreInteret;
}

