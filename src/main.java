import java.sql.*;


public class main {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.sqlite.JDBC");
			
			//Open connection
			Connection conn = DriverManager.getConnection("jdbc:sqlite:data/usuario.sql.db");
			
			//Creation statement
			Statement stmt = conn.createStatement();
			
			//Take data
			ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO");
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				
				System.out.println(nombre+" "+apellido);
			}
			
			//Add change
			//stmt.executeUpdate(sql);
			
			//At the end, put stmt.close() and conn.close()
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't load the driver");
		} catch (SQLException e) {
			System.out.println("Can't load the database");
		}

	}

}
