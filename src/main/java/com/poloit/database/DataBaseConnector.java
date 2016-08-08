package com.poloit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnector
{
	// Singleton
	private static DataBaseConnector dbConn = null;
	private static Connection conn = null;

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/Veterinary";

	// Database credentials
	// Hard Coded for the moment
	static final String USER = "root";
	static final String PASS = "1234";

	private DataBaseConnector() throws SQLException
	{
		if (dbConn != null)
			return;
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	public static void openConnection()
	{
		try
		{
			// Register JDBC Driver
			Class.forName(JDBC_DRIVER);

			System.out.println("Connecting to database...");
			dbConn = new DataBaseConnector();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public static void closeConnection()
	{
		try
		{
			if (conn != null)
			{
				conn.close();
				System.out.println("Closing connection to database...");
			}
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}

	public static void selectionQuery()
	{
		String query = "SELECT * FROM Animal;";
		try
		{
			Statement stmt;
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
			{
				
				int id = rs.getInt("id");
				String name = rs.getString("name");

				System.out.println(id + " " + name);
			}
		}

		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}

	public static void tableModificationQuery(int id, String name)
	{
		try
		{
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO Animal VALUES(" + id + ", '" + name + "');";
			stmt.executeUpdate(query);
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
	}
}
