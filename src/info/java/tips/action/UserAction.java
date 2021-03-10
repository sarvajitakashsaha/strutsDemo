package info.java.tips.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import info.java.tips.form.RegistrationForm;
import info.java.tips.form.UserForm;
import info.java.tips.service.loginService;

public class UserAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		loginService loginService = new loginService();
		ActionForward fw = mapping.findForward("error");
		UserForm uf = (UserForm) form;
		try {
			List<RegistrationForm> list = loginService.getUserList();
			uf.setList(list);
			fw = mapping.findForward("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return fw;
	}
}
