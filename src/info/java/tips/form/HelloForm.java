package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
//	<message-resources parameter="info.java.tips.i18n.MessageBundle"></message-resources>
}
