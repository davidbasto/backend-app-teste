package br.jus.csjt.backend.service;

import java.util.Arrays;
import java.util.List;
import br.jus.csjt.backend.model.Uf;

public class UfServico {

	public List<Uf> getListaUfs() {
		List<Uf> listaUfs = Arrays.asList(
			new Uf("SP", "São Paulo"),
			new Uf("RJ", "Rio de Janeiro"),
			new Uf("MG", "Minas Gerais")
		);

		return listaUfs;
	}
}
