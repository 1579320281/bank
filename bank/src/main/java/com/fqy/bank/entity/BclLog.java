package com.fqy.bank.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

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
@Table(name = "bcl_log")
public class BclLog implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long bclId ;
	
	@Column(name = "bcl_money")
	double bclMoney ;
	
	@JoinColumn(name = "from_id")
	@ManyToOne
	@JsonIgnore
	BankCard fromId ;
	
	@JoinColumn(name = "to_id")
	@ManyToOne
	@JsonIgnore
	BankCard toId ;
	
	@Column(name = "to_name")
	String toName ;
	
	@Column(name = "bcl_time",columnDefinition = "Timestamp")
	Timestamp bclTime ;
	
	@Column(name = "bcl_postscript")
	String bclPostscript ;

	public Long getBclId() {
		return bclId;
	}

	public void setBclId(Long bclId) {
		this.bclId = bclId;
	}

	public double getBclMoney() {
		return bclMoney;
	}

	public void setBclMoney(double bclMoney) {
		this.bclMoney = bclMoney;
	}

	public BankCard getFromId() {
		return fromId;
	}

	public void setFromId(BankCard fromId) {
		this.fromId = fromId;
	}

	public BankCard getToId() {
		return toId;
	}

	public void setToId(BankCard toId) {
		this.toId = toId;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public Timestamp getBclTime() {
		return bclTime;
	}

	public void setBclTime(Timestamp bclTime) {
		this.bclTime = bclTime;
	}

	public String getBclPostscript() {
		return bclPostscript;
	}

	public void setBclPostscript(String bclPostscript) {
		this.bclPostscript = bclPostscript;
	}
	
	
	
}
