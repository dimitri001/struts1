package es.korso.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import es.korso.entity.User;

public class RegistroAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		
		DynaActionForm registerForm = (DynaActionForm) form;
		
		String login = (String) registerForm.get("login");
		String email = (String) registerForm.get("email");
		Byte edad = (Byte) registerForm.get("age");
		
		//Realizaríamos las acciones en los objetos de negocio - en nuestro caso nada
		
		//Configuraríamos los objetos Request, Session, etc, que necesita la siguiente vista a mostrar 
		
		User user = new User();
		user.setLogin(login);
		user.setEmail(email);
		user.setAge(edad.byteValue());
		
		request.setAttribute("registerUser", user);
		
		//Mostramos la siguiente vista
		
		return mapping.findForward("ok");
	}
	
	
}
