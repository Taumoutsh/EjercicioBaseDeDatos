import java.sql.*;


public class main {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.sqlite.JDBC");
			
			//Open connection
			Connection conn = DriverManager.getConnection("jdbc:sqlite:data/usuario.sql.db");
			
			//Creation statement
			Statement stmt = conn.createStatement();
			
			//At the end, put conn.close()
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't load the driver");
		} catch (SQLException e) {
			System.out.println("Can't load the database");
		}

	}

}
