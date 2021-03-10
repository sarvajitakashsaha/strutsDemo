package info.java.tips.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm{

	private List<RegistrationForm> list;

	public List<RegistrationForm> getList() {
		return list;
	}

	public void setList(List<RegistrationForm> list) {
		this.list = list;
	} 
	
	
}
