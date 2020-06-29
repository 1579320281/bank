package com.fqy.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bank_card")
public class BankCard implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long BcId ;
	
	@Column(columnDefinition = "decimal")
	double balance ;
	
	@ManyToOne
	@JoinColumn(name = "p_number")
	@JsonIgnore
	Phone phone;
	
	@Column(name = "bc_state")
	int bcState ;

	public Long getBcId() {
		return BcId;
	}

	public void setBcId(Long bcId) {
		BcId = bcId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public int getBcState() {
		return bcState;
	}

	public void setBcState(int bcState) {
		this.bcState = bcState;
	}
	
	
}
