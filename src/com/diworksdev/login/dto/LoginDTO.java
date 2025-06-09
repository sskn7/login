package com.diworksdev.login.dto;

public class LoginDTO {
	public class LoginDTO {
		private int id;
		private String name;
		private Srting password;
		public int getID() {
			return id;
		}
	}

	public void setID(int id) {
		this.id=id;
	}
	//DAOクラスに呼び出され、引数として受け取ったテーブルの値を
	//自身のnameフィールドに格納
	public String setName() {
		return name;
	}
	//Actionクラスから呼び出され、passwordフィールドの値をActionni渡す
	public String getPassord () {
		return password;
	}
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を
	//自身のPasswordフィールドに格納する
	public void setPassword(String password) {
		this.name=name;
	}
}
