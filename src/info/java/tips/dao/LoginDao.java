package info.java.tips.dao;

import java.sql.SQLException;
import java.util.List;

import info.java.tips.form.RegistrationForm;

public interface LoginDao {
	 public boolean addLogin(RegistrationForm regForm) throws SQLException;
	 public boolean validate(RegistrationForm regForm) throws SQLException;
	 public boolean validateName(RegistrationForm regForm) throws SQLException;
	 public List<RegistrationForm> getUserList() throws SQLException;
	}


