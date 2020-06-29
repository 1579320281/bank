package com.fqy.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_info")
public class UserInfo implements Serializable{
	
	@Id
	@OneToOne
	@JoinColumn(name = "u_account")
	@JsonIgnore
	UserAcc UserAccount ;
	
	@OneToOne
	@JoinColumn(name = "u_role")
	@JsonIgnore
	Role role ;
	
	@ManyToOne
	@JoinColumn(name = "u_phone")
	@JsonIgnore
	Phone userPhone ;
	
	@Column(name = "u_work")
	String work ;
	
	@Column(name = "u_nowAdd")
	String nowAddress ;
	
	
	public Phone getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Phone userPhone) {
		this.userPhone = userPhone;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getNowAddress() {
		return nowAddress;
	}

	public void setNowAddress(String nowAddress) {
		this.nowAddress = nowAddress;
	}

	public UserAcc getUserAccount() {
		return UserAccount;
	}

	public void setUserAccount(UserAcc userAccount) {
		UserAccount = userAccount;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	} 
	
}
