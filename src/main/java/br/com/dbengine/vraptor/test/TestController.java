package br.com.dbengine.vraptor.test;

//import org.apache.shiro.authz.annotation.RequiresAuthentication;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
//import br.com.caelum.vraptor.security.annotation.Secured;

//@Secured
@Controller
public class TestController {

	//@RequiresAuthentication
	@Get("/test/apenasLogados")
	public void apenasLogados() {
		
	}

}