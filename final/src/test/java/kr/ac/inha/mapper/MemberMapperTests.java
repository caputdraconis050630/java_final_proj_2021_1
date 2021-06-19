package kr.ac.inha.mapper;



import java.sql.Connection;

import java.sql.DriverManager;



import org.junit.Test;



public class MemberMapperTests {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/FINAL";

	private static final String USER ="root";

	private static final String PW = "111111";

	

	@Test

	public void testConnection() throws Exception{

		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW))	{

			System.out.println(con);

			

		}catch(Exception e){

			System.err.println(e);

		}

	}

}