package com.sowing.seed.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOILDETAILS", schema = "sowing")
public class Soil implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SOILID")
	private int soilID;
	@Column(name = "SOILNAME")
	private String soilName;

	public int getSoilID() {
		return soilID;
	}

	public void setSoilID(int soilID) {
		this.soilID = soilID;
	}

	public String getSoilName() {
		return soilName;
	}

	public void setSoilName(String soilName) {
		this.soilName = soilName;
	}

}
