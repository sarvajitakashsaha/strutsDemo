package info.java.tips.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import info.java.tips.dao.LoginDao;
import info.java.tips.form.RegistrationForm;
import info.java.tips.utilities.DBUtilities;

public class LoginDaoImplementation implements LoginDao
{
	 public boolean addLogin(RegistrationForm regForm) throws SQLException
	 {
	  Connection con=null;
	  boolean access=false;
	  
	  try
	  {
	   con=DBUtilities.getConnection();
	   
	   String query= "insert into user values (?,?)";
	   PreparedStatement stmt= con.prepareStatement(query);
	   stmt.setString(1, regForm.getUsername());
	   stmt.setString(2, regForm.getPassword());
	   int result= stmt.executeUpdate();
	   
	   if(result>0)
	   {
	    access=true;
	   }
	  }
	  finally
	  {
	   DBUtilities.closeConnection(con);
	  }
	  return access;
	 }
	 
	 public boolean validate(RegistrationForm regForm) throws SQLException
	 {
	  Connection con=null;
	  boolean status=false;
	  
	  try
	  {
	   con=DBUtilities.getConnection();
	   
	   String query= "select * from user where username = ? and password = ? ";
	   PreparedStatement stmt= con.prepareStatement(query);
	   stmt.setString(1, regForm.getUsername());
	   stmt.setString(2, regForm.getPassword());
	   ResultSet result= stmt.executeQuery();
	   status = result.next();
	   System.out.println("result is :: " + result);   
	  }
	  finally
	  {
	   DBUtilities.closeConnection(con);
	  }
	  return status;
	 }

	@Override
	public boolean validateName(RegistrationForm regForm) throws SQLException {
		// TODO Auto-generated method stub
		 Connection con=null;
		  boolean status=false;
		  
		  try
		  {
		   con=DBUtilities.getConnection();
		   
		   String query= "select * from user where username = ?";
		   PreparedStatement stmt= con.prepareStatement(query);
		   stmt.setString(1, regForm.getUsername());
		   ResultSet result= stmt.executeQuery();
		   status = result.next();
		   System.out.println("result is :: " + result);   
		  }
		  finally
		  {
		   DBUtilities.closeConnection(con);
		  }
		  return status;
	}

	@Override
	public List<RegistrationForm> getUserList() throws SQLException {
		 Connection con=null;
		 List<RegistrationForm> list = new ArrayList<RegistrationForm>();
		 try {
			 con=DBUtilities.getConnection();
			 String sql= "select * from user";
			 PreparedStatement stmt= con.prepareStatement(sql);
			 ResultSet result= stmt.executeQuery();
						 while(result.next()) {
				 RegistrationForm user = new RegistrationForm();
				 user.setUsername(result.getString("username"));
				 user.setPassword(result.getString("password"));
				 list.add(user);
			 }
		 }finally {
			 DBUtilities.closeConnection(con);
		 }
		return list;
	}
	 
	}
