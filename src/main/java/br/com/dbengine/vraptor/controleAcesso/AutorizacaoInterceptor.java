package br.com.dbengine.vraptor.controleAcesso;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.LoginController;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.caelum.vraptor.view.Results;
import br.com.dbengine.vraptor.annotation.Restrito;

@Intercepts(after = AutenticacaoInterceptor.class)
public class AutorizacaoInterceptor {
	private UsuarioLogado usuario;
	private Result result;

	@Inject
	public AutorizacaoInterceptor(UsuarioLogado usuario, Result result) {
		this.usuario = usuario;
		this.result = result;
	}
	
	@Deprecated	AutorizacaoInterceptor()	{}

	@Accepts
	public boolean ehRestrito(ControllerMethod method) {
		//return !method.getController().getType().equals(LoginController.class);
		System.out.println(">>AutorizacaoInterceptor.ehRestrito");		
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
	public void autoriza(SimpleInterceptorStack stack, ControllerMethod method) {
		System.out.println(">>AutorizacaoInterceptor.autoriza");
		if (podeAcessar(method)) {
			stack.next();
		} else {
			result.use(Results.http()).sendError(401, "Você	não	está autorizado!");
		}
	}

	public boolean podeAcessar(ControllerMethod method) {
		return method.containsAnnotation(Get.class) || usuario.getUsuario().isAdmin();
	}
}