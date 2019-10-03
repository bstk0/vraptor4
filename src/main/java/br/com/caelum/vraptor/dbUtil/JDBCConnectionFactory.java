package br.com.caelum.vraptor.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnectionFactory {
	
	private Connection dbConn; 
	
	public Connection getConnection() {
		if (dbConn == null) {
			dbConn = this.createConnection();
			System.out.println("CRIANDO CONEXAO JDBC...");
		}
		try {
			if (dbConn.isClosed()) {
				dbConn = this.createConnection();
				System.out.println("DB CLOSED - CRIANDO CONEXAO JDBC...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("JDBCConnectionFactory : " + dbConn.getCatalog());
		return dbConn; 
	}
	
	private Connection createConnection() {
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
	}

}
