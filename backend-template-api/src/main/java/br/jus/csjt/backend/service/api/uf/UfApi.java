package br.jus.csjt.backend.service.api.uf;

import java.util.List;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.jus.csjt.backend.model.Uf;
import br.jus.csjt.backend.service.UfServico;

@Path("uf")
@PermitAll
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UfApi {

	@Inject
	UfServico ufServico;
	
	@GET
	@Path("/")
	public Response buscarLookupSigla(@DefaultValue("") @QueryParam("termo") String termo) {
		
		List<Uf> result = this.ufServico.getListaUfs();
		
		if (result != null) {
			return Response.ok().entity(result).build();	
		} else {
			return Response.noContent().build();
		}
	}
	
}
