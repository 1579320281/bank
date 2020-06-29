package com.fqy.bank.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="id_card")
public class IdCard {
	
	@Id//主键
	Long id ;//身份证号
	
	@Column
	String name ; //姓名
	
	@Column
	String sex ;//性别
	
	@Column
	String nationality ;//国家
	
	@Column
	String address ;//地址
	
	@Column
	String ethnic ;//民族
	
	//@OneToMany(mappedBy = "idCard")
	//Set<Phone> Phone = new HashSet<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

//	public Set<Phone> getPhone() {
//		return Phone;
//	}
//
//	public void setPhone(Set<Phone> phone) {
//		Phone = phone;
//	}
	
	
}
