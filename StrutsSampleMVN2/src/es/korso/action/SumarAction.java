package es.korso.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import es.korso.form.SumarForm;

public class SumarAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		ActionForward forward = null;
		
		if(this.isCancelled(request)){
			forward = mapping.findForward("cancel");
			
		}else{
			SumarForm operationForm = (SumarForm) form;
			
			int operando1 = Integer.parseInt(operationForm.getOperando1());
			int operando2 = Integer.parseInt(operationForm.getOperando2());
			
			operationForm.setResultado(String.valueOf(operando1 + operando2));
			
			forward = mapping.findForward("ok");
		}
		
		return forward;
	}
	
}
