package com.fqy.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff implements Serializable{
	
	@Id
	@Column(name = "staff_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long staffId ;
	
	@JoinColumn(name = "staff_account")
	@OneToOne
	StaffAcc staffAcc ;
	
	@OneToOne
	@JoinColumn(name = "staff_card")
	IdCard idCard ;
	
	@OneToOne
	@JoinColumn(name = "role_id")
	Role role ;
	
	@OneToOne
	@JoinColumn(name = "p_number")
	Phone staffPhone ;

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public StaffAcc getStaffAcc() {
		return staffAcc;
	}

	public void setStaffAcc(StaffAcc staffAcc) {
		this.staffAcc = staffAcc;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Phone getStaffPhone() {
		return staffPhone;
	}

	public void setStaffPhone(Phone staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	
	
}
