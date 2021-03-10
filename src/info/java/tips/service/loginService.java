package info.java.tips.service;

import java.sql.SQLException;
import java.util.List;

import info.java.tips.dao.impl.LoginDaoImplementation;
import info.java.tips.form.RegistrationForm;

public class loginService {
	LoginDaoImplementation loginDao = new LoginDaoImplementation();

	public boolean addLogin(RegistrationForm regForm) throws SQLException {
		if (loginDao.addLogin(regForm))
			return true;
		else
			return false;
	}

	public boolean validate(RegistrationForm regForm) throws SQLException {
		if (loginDao.validate(regForm))
			return true;
		else
			return false;
	}

	public boolean validateName(RegistrationForm regForm) throws SQLException {
		if (loginDao.validateName(regForm))
			return true;
		else
			return false;
	}
	
	public List<RegistrationForm> getUserList() throws SQLException{
		List<RegistrationForm> list =  loginDao.getUserList();
		return list;
	}
}