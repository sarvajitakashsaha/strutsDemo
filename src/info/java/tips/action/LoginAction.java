package info.java.tips.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import info.java.tips.form.RegistrationForm;
import info.java.tips.service.loginService;

public class LoginAction extends Action{

	@Override
	 public ActionForward execute(ActionMapping mapping, ActionForm form,
	   HttpServletRequest request, HttpServletResponse response)
	   throws Exception {
	  RegistrationForm regForm=(RegistrationForm) form;
	  loginService loginService= new loginService();
	  
	  try
	  {
	   if(loginService.validate(regForm))
	    return mapping.findForward("success");
	   else
	    return mapping.findForward("failure");
	  }
	  catch (Exception e)
	  {
	   return mapping.findForward("failure");
	  }
	 
	 }

}
