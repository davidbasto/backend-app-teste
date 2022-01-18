package br.jus.csjt.san.template.service;

import java.util.Arrays;
import java.util.List;
import br.jus.csjt.san.template.model.Uf;

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
