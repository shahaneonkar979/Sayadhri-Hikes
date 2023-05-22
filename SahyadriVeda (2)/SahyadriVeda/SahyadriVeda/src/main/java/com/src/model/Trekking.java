package com.src.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="trekking1")
public class Trekking {

	@Id
	private int id;//one trekker has many forts
	@OneToMany(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = (true))
	List<Fort>forts;
	
	@ManyToOne//many trekking has one trekker
	private Trekker trekker;

	private Trekking(int id, List<Fort> forts, Trekker trekker) {
		super();
		this.id = id;
		this.forts = forts;
		this.trekker = trekker;
	}

	private Trekking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Fort> getForts() {
		return forts;
	}

	public void setForts(List<Fort> forts) {
		this.forts = forts;
	}

	public Trekker getTrekker() {
		return trekker;
	}

	public void setTrekker(Trekker trekker) {
		this.trekker = trekker;
	}
	
	
	
	
}
