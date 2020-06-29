package com.fqy.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@Column(name="p_number")
	Long tel ;//手机号
	
	@ManyToOne
	@JoinColumn(name = "id_card")
	@JsonIgnore
	IdCard idCard ;

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	
	
}
