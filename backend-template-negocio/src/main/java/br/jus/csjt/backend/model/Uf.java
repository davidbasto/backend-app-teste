package br.jus.csjt.backend.model;

public class Uf {
	private String sigla;

	private String descricao;

	public Uf(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return this.sigla;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
