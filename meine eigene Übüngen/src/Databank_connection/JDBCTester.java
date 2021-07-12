package Databank_connection;


import java.sql.*;


public class JDBCTester
{
  public static void main(String[] args) throws SQLException
  {DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver() );
   Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");   
   Statement stmt = con.createStatement();
   ResultSet rset = stmt.executeQuery("SELECT farbe FROM pflanzen where bl_e>5");
   while (rset.next())
         {System.out.println(rset.getString(1));   
         }
   return;

  }
}
