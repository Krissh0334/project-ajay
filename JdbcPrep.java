import java.sql.*;
import java.io.*;

class JdbcPrep

{
	public static void main(String ar[])
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Ajay@143";
		try{
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(i);
			System.out.println("please enter your rollno");
			String rno = b.readLine();
			System.out.println("please enter your name");
			String name= b.readLine();
			
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		String qry = "insert into student values(?,?)";
        PreparedStatement stmt = con.prepareStatement(qry);
		stmt.setInt(1,Integer.parseInt(rno));
		stmt.setString(2,name);
		stmt.executeUpdate();

		con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
