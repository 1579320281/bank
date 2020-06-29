package com.fqy.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_acc")
public class StaffAcc implements Serializable{
	
	@Id
	@Column(name = "staf_account")
	String staffAcc ;
	
	@Column(name = "staff_password")
	String staffPwd ;

	public String getStaffAcc() {
		return staffAcc;
	}

	public void setStaffAcc(String staffAcc) {
		this.staffAcc = staffAcc;
	}

	public String getStaffPwd() {
		return staffPwd;
	}

	public void setStaffPwd(String staffPwd) {
		this.staffPwd = staffPwd;
	}
	
	
	
}
