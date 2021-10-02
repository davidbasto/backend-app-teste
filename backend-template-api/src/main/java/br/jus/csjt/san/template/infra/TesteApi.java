package br.jus.csjt.san.template.infra;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("teste")
public class TesteApi {
	
	@Inject
	private Logger logger;

	@GET
	public String testar() {
		logger.info("Teste Info");
		logger.warning("Teste info");
		
		return "Teste finalizado.";
	}
}
