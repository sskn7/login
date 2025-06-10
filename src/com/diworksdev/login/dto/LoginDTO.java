package com.diworksdev.login.dto;

public class LoginDTO {
		private int id;
		//フィールド変数を宣言
		private String name;
		private String password;

	//フィールド変数に対応したgetterとsetterを定義する
	public int getID() {
			return id;
	}

	public void setID(int id) {
		this.id=id;
	}

	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getName() {
		return name;
	}

	//DAOクラスに呼び出され、引数として受け取ったテーブルの値を
	//自身のnameフィールドに格納
	public void setName(String name) {
		this.name = name;
	}
	//Actionクラスから呼び出され、passwordフィールドの値をActionに渡す
	public String getPassord () {
		return password;
	}
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を
	//自身のPasswordフィールドに格納する
	public void setPassword(String password) {
		this.password = password;
	}
}
