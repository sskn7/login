package com.diworksdev.login.dto;

public class LoginDTO {
		private int id;
		private String name;
		private String password;

	public int getID() {
			return id;
	}

	public void setID(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword () {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
