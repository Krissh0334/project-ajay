import java.sql.*;

class MyJdbcEx

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
		stmt.executeUpdate("insert into student values(5,'Kumari')");

		con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
