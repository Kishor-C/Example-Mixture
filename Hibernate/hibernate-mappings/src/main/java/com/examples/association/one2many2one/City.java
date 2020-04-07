package com.examples.association.one2many2one;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class City {

	@Id
	@Column(name = "city_id")
	private String cityId;
	
	@Column(name = "city_name")
	private String cityName;
	
	@ManyToOne
	@JoinTable(name = "state_city_ref", joinColumns = @JoinColumn(name = "city_ref"), 
		inverseJoinColumns = @JoinColumn(name = "state_ref"))
	private State state;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
