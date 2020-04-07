package com.examples.association.one2many2one;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class State {

	@Id
	@Column(name = "state_id")
	private String stateId;
	
	@Column(name = "state_name")
	private String stateName;
	
	@OneToMany
	@JoinTable(name = "state_city_ref", 
		joinColumns = @JoinColumn(name = "state_ref"), 
		inverseJoinColumns = @JoinColumn(name = "city_ref"))
	//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
	private List<City> cities;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}
