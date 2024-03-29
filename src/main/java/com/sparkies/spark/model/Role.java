package com.sparkies.spark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;

	public Role() {

	}

	public Integer getId() {
		return id;
	}

	public Role(Integer id, ERole name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ERole getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(ERole name) {
		this.name = name;
	}

}