package br.com.caelum.vraptor.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElephantSQLClient {

	private JDBCConnectionFactory dbFactory = new JDBCConnectionFactory();

	public Connection getConnection() {
		
		return dbFactory.getConnection();
		
		/*
        //String url = "jdbc:postgres://xmkvsriw:0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL@elmer.db.elephantsql.com:5432/xmkvsriw";  //"jdbc:postgresql://host:port/database";
		String url = "jdbc:postgresql://elmer.db.elephantsql.com:5432/xmkvsriw";  //"jdbc:postgresql://host:port/database";
        String username = "xmkvsriw";
        String password = "0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL";

        try {
        	Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, username, password);
        }    
            catch (java.sql.SQLException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
           }     
        return null;
        */
	}

	
/*	public Statement getConnection() {
        String url = "postgres://xmkvsriw:0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL@elmer.db.elephantsql.com:5432/xmkvsriw";  //"jdbc:postgresql://host:port/database";
        String username = "xmkvsriw";
        String password = "0HlF-y1j5NUUszyn-2PqhgfJ-SJPPyWL";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            return db.createStatement();
        }    
            catch (java.sql.SQLException e) {
                System.out.println(e.getMessage());
            }     
        return null;
	}
*/	
	public void testConnection() {
        try {
		Connection db = this.getConnection();
 				Statement st = db.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM FORNECEDOR");
				while (rs.next()) {
				    System.out.print("Column 1 returned ");
				    System.out.println(rs.getString(1));
				    System.out.print("Column 2 returned ");
				    System.out.println(rs.getString(2));
				}
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
