package com.fqy.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "audit_id")
	Long auditId ;
	
	@JoinColumn(name = "bc_id")
	@OneToOne
	BankCard bcId ;
	
	@JoinColumn(name = "id_card")
	@ManyToOne
	IdCard idCard ;
	
	@JoinColumn(name = "staff_id")
	@ManyToOne
	Staff staffId ;
	
	@Column(name = "audit_state")
	int state ;

	public Long getAuditId() {
		return auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public BankCard getBcId() {
		return bcId;
	}

	public void setBcId(BankCard bcId) {
		this.bcId = bcId;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	public Staff getStaffId() {
		return staffId;
	}

	public void setStaffId(Staff staffId) {
		this.staffId = staffId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
}
