package br.com.dbengine.vraptor.interceptors;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.LoginController;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.dbengine.vraptor.annotation.Restrito;
import br.com.dbengine.vraptor.controleAcesso.UsuarioLogado;

//@Intercepts
public class SimpleAuthInterceptor { //implements Interceptor {

	private  UsuarioLogado usuario;
	private  Result result;
	
	@Inject
	public SimpleAuthInterceptor(UsuarioLogado usuario, Result result) {
		this.usuario = usuario;
		this.result = result;
	}
	
	@Accepts
	public boolean accepts(ControllerMethod method) {
		System.out.println(">>SimpleAuthInterceptor.accepts");		
		//boolean autorizado=false;
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

	@AroundCall	
	public void intercept(SimpleInterceptorStack stack, ControllerMethod method,
			Object instance) throws InterceptionException {

		System.out.println(">>SimpleAuthInterceptor.intercept");		

		//result.redirectTo(LoginController.class).formulario();		
		if (usuario.isLogado()) {
			stack.next();
		} else {
			result.redirectTo(LoginController.class).formulario();
		}
	}
}
