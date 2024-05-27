package com.StudentServlet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
public class DBConnection {
	
	private DataSource dataSource;
	public DBConnection(DataSource theDataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = theDataSource;
	}
	public List<SettersGetters> getStudents() {
		// TODO Auto-generated method stub
		List<SettersGetters> Students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String s = "Select * from Student";
			
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(s);
			
			while(myRs.next()) {
				int ID = myRs.getInt("id");
				String NAME = myRs.getString("Name");
				String GENDER = myRs.getString("Gender");
				String EMAIL = myRs.getString("Email");
				String PHONE = myRs.getString("Phone");
				
				SettersGetters tempStudent = new SettersGetters(ID, NAME, GENDER, EMAIL, PHONE);
				
				Students.add(tempStudent);
			}
			
			System.out.println(Students);
			return Students;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(myConn,myStmt,myRs);
		}
		
		
		return null;
	}
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myRs !=null) {
				myRs.close();
			}
			
			if(myStmt !=null) {
				myStmt.close();
			}
			
			if(myConn !=null) {
				myConn.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}




