package com.shurjomukhi.crud.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	
	@Column(unique = true)
	@NotNull(message = "Name is mandatory")
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private Integer phoneNum;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}
