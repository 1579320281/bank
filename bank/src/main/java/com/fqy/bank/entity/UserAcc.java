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
@Table(name="user_acc")
public class UserAcc implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "phone")
	@JsonIgnore
	Phone UserAccount ;
	
	@Column(name = "u_password",nullable = false)
	String UserPassword ;

	

	public Phone getUserAccount() {
		return UserAccount;
	}

	public void setUserAccount(Phone userAccount) {
		UserAccount = userAccount;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
	
}
