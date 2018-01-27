package ca.cgodin.beans;
import java.sql.*;
import java.util.*;
public class Noms {

	private  Connection con;

	public void loadDataBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Users>	getUsers(){

		ArrayList<Users> myUsers=new ArrayList();


		Statement st =null;
		ResultSet rs= null;
		loadDataBase();
		try { 
			st=con.createStatement();
			rs=st.executeQuery("select nom,prenom from noms");
			while (rs.next()) {
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenom");
				Users us=new Users();
				us.setNom(nom);
				us.setPrenom(prenom);
				myUsers.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if(rs!=null)
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return myUsers;
	}

public void addUser(Users user) {
	loadDataBase();
	try {
		PreparedStatement ps=con.prepareStatement("INSERT INTO noms (nom,prenom)values (?,?);");
		
		ps.setString(1,user.getNom());
		ps.setString(2, user.getPrenom());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


}
