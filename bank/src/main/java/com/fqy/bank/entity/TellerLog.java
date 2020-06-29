package com.fqy.bank.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tell_log")
public class TellerLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tl_id")
	Long tlId ;
	
	@ManyToOne
	@JoinColumn(name = "bcl_id")
	BankCard bclId ;
	
	@ManyToOne
	@JoinColumn(name = "staff_id")
	Staff staffId ;
	
	@Column(name = "tl_time")
	Timestamp tlTime ;
	
	@Column(name = "tl_type")
	String tlType ;

	public Long getTlId() {
		return tlId;
	}

	public void setTlId(Long tlId) {
		this.tlId = tlId;
	}

	public BankCard getBclId() {
		return bclId;
	}

	public void setBclId(BankCard bclId) {
		this.bclId = bclId;
	}

	public Staff getStaffId() {
		return staffId;
	}

	public void setStaffId(Staff staffId) {
		this.staffId = staffId;
	}

	public Timestamp getTlTime() {
		return tlTime;
	}

	public void setTlTime(Timestamp tlTime) {
		this.tlTime = tlTime;
	}

	public String getTlType() {
		return tlType;
	}

	public void setTlType(String tlType) {
		this.tlType = tlType;
	}
	
	
	
	
	
}
