package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;

import java.sql.ResultSet;

import model.dao.*;

public class ReadData extends AbstractDAO {
	//private String dataMap;
	
	public ReadData() {
		
		try {
			this.lireBase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*BoulderDashBDDConnector connector = new BoulderDashBDDConnector();
		
	    System.out.println("message");
	    System.out.println(connector.executeQuery("SELECT * FROM maps WHERE id=1"));
	  */
}
	public void lireBase() throws SQLException {
		String url = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";
		String login = "root";
		String passwd = "";
		Connection cn = null; 
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		cn = DriverManager.getConnection(url, login, passwd);
		
		st = (Statement) cn.createStatement();
		String sql = "SELECT * FROM	maps";
		
		rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("map"));
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
