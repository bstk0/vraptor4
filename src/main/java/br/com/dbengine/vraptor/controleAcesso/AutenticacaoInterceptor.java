package br.com.dbengine.vraptor.controleAcesso;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.LoginController;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.dbengine.vraptor.annotation.Restrito;

@Intercepts
public class AutenticacaoInterceptor {
	private UsuarioLogado usuario;
	private Result result;

	@Inject
	public AutenticacaoInterceptor(UsuarioLogado usuario, Result result) {
		this.usuario = usuario;
		this.result = result;
	}

	@Deprecated	AutenticacaoInterceptor()	{}
	
	@AroundCall
	public void autentica(SimpleInterceptorStack stack) {
		System.out.println(">>AutenticacaoInterceptor.autentica");
		if (usuario.isLogado()) {
			stack.next();
		} else {
			result.redirectTo(LoginController.class).formulario();
		}
	}
	
	@Accepts
	public	boolean	ehRestrito(ControllerMethod	method) {
		//return	!method.getController().getType().equals(LoginController.class);
		System.out.println(">>AutenticacaoInterceptor.ehRestrito");

		boolean autorizado= !method.containsAnnotation(Restrito.class); // assim se não tiver a anotação não passa pelo interceptor

		if (method.containsAnnotation(Restrito.class) && usuario.isLogado())
		{
			String[] values = method.getMethod().getAnnotation(Restrito.class).value();
				
			for(int i=0;i<values.length;i++)
			{
				if (usuario.getNivel().equals(values[i]))
				{
					autorizado = true;
				}
			}
		}

		return !autorizado;

	}
}
