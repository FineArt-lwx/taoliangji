package com.domain;

import java.io.Serializable;


/*
 * 客户的实体类
 */
public class User implements Serializable {
	
	private String phone;
	private String username;
	private String password;
	private String email;
	private String role;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [phone=" + phone + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", role=" + role + "]";
	}
	
	

}
