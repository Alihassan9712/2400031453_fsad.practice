package com.klu;
import java.sql.*;

public class JDBC_create {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/fsads3";
		String user="root";
		String pwd="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Established");
			String query="create table if not exists Student("+"id int primary key auto_increment,"+"name varchar(20)"+")";
			Statement st=con.createStatement();
			st.execute(query);
			st.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}