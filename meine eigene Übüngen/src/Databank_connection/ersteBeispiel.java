package Databank_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ersteBeispiel {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SYSTEM","system");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select SORTE from PFLANZEN");
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
