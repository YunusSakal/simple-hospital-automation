package com.grup9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myJDBC {
public static Connection vbBaglan() {
	Connection connection =null;
	try {
		connection=  DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/hastane", //veritabanı ısmını degiştir
				 "root","");
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
	return connection;
}
public static void main(String[] args) {
	myJDBC baglanti = new myJDBC();
}
}
