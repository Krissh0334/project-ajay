import java.sql.*;

class Jdbcresult

{
	public static void main(String ar[])
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "Ajay@143";
		try{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		ResultSet res=stmt.executeQuery("select*from student");
		while(res.next())
		{
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
		}
		con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

