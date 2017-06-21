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

/**
 * Controller
 * @author      Loick Legay 
 * @since       2017-06-21
 * 
 */

public class ReadData implements IModel {
	//private String dataMap;
	
	public char tabMap[][];
	public String data = null;
	
	//CONSTRUCTOR
	public ReadData() {
		
		
		try {
			this.lireBase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this.text();
		
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
			
			
			this.data = (rs.getString("map"));
		}
		
		//System.out.println(data);
		this.split();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void split() {
		//tableau
		
		this.tabMap = new char[25][25];
		String[] splitArray = null;
		String str = this.data;
		splitArray = str.split(";");
		for(int i = 0; i<25;i++){
			   
			
			for(int y = 0; y<25;y++){
				
				
				this.tabMap[i][y]=splitArray[i].charAt(y);
				
			} 
		}
		
		
		/*for(int i = 0; i < this.tabMap.length; i++) {
            for(int j =0; j < this.tabMap.length; j++) {
                 
                System.out.print(this.tabMap[i][j]);
             
 
            }
            System.out.println("");
        }*/
		
		
		
	}
	
	public IModel getReadData() {
		return new ReadData();
	}
}