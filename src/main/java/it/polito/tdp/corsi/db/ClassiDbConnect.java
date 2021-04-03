package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassiDbConnect {

	public static Connection getConnection() {
		
		String jdbcURL= "jdbc:mysql://localhost/iscritticorsi?user=root&password=ciaociao99";
		try {
			return DriverManager.getConnection(jdbcURL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
