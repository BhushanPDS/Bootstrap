package day8com.thinikitive;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDB {
	public static void main(String[] args) {
		ResultSet rs;
		try {
			//REgister DRiver class
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bhushan","root","123456");
		
			
			Statement st=con.createStatement();
			st.execute("insert into emp values(11,'PDS')");
			System.out.println("sucessfully inserted");
			rs=st.executeQuery("select * from bnv");
			
		//	st.executeUpdate("delete from emp where eid=1");
			System.out.println("deleted");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			System.out.println("success");
			
			con.close();
			
			
			
			} 
			
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
