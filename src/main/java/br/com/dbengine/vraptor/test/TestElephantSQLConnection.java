package br.com.dbengine.vraptor.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestElephantSQLConnection {
	
	   public static void main(String[] args) {
	        try {
	            Class.forName("org.postgresql.Driver");
	        }
	        catch (java.lang.ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        String url = "postgres://xmkvsriw:0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL@elmer.db.elephantsql.com:5432/xmkvsriw";  //"jdbc:postgresql://host:port/database";
	        String username = "xmkvsriw";
	        String password = "0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL";

	        try {
	            Connection db = DriverManager.getConnection(url, username, password);
	            Statement st = db.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM FORNECEDOR");
	            while (rs.next()) {
	                System.out.print("Column 1 returned ");
	                System.out.println(rs.getString(2));
	                System.out.print("Column 2 returned ");
	                System.out.println(rs.getString(3));
	            }
	            rs.close();
	            st.close();
	            }
	        catch (java.sql.SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
