package bean;
import java.sql.*;

public class RegisterDao {

	public static int register(User u){
		
		int status=0;
		
		
		Connection con =ConnectionProvider.getCon();
		try{
			
			String sqlSelect = "SELECT * FROM users WHERE username = ? AND password = ?";
	           

            PreparedStatement ps2 = con.prepareStatement(sqlSelect);
            ps2.setString(1, u.getUsername());
            ps2.setString(2, u.getPassword());

          
             ResultSet rs =ps2.executeQuery();
             

         
             if(!rs.next()) {
               System.out.println("username valida");
               PreparedStatement ps=con.prepareStatement("INSERT INTO users(username,password,mail) VALUES(?,?,?)");
    			ps.setString(1, u.getUsername());
    			ps.setString(2, u.getPassword());
    			ps.setString(3, u.getMail());
   			status=ps.executeUpdate();
             }
             else {
            
               System.out.println("username già esistente");
             }
             
			
		}catch (Exception e){
			System.out.println(e);
		}
		
	
		return status;
	}
}
