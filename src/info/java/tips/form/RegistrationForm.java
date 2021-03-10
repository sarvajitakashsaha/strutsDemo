package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class RegistrationForm extends ActionForm{
	 private static final long serialVersionUID = 1L;
	 private int id;
	  private String username; 
	  private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	  
	  

}
