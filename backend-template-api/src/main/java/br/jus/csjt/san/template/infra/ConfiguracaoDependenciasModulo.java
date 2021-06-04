/**
 * 
 */
package br.jus.csjt.san.template.infra;

import java.time.LocalTime;

import br.jus.csjt.san.base.metricas.AbstractDependenciasModuloConfig;
import br.jus.csjt.san.base.metricas.IDependenciaRecurso;
import br.jus.csjt.san.base.metricas.enums.TipoMetricaEnum;

/**
 * @author CSJT-Conselho Superior da Justiça do Trabalho.
 *
 */
public class ConfiguracaoDependenciasModulo extends AbstractDependenciasModuloConfig {

	/**
	 * @see br.jus.csjt.san.base.metricas.AbstractDependenciasModuloConfig#registrarDependencias()
	 */
	@Override
	public void registrarDependencias() {
		adicionarDependenciaPropriedade("usuario.smtp");
		adicionarDependenciaDatasource("backend-templateDS");
		adicionarDependencia(validarDependenciaServicoGenerico());
	}

	/**
	 * Este método representa a possibilidade de customizar qualquer tipo de
	 * validação, bastando implementar a interface {@link IDependenciaRecurso}.
	 * 
	 * @return
	 */
	private IDependenciaRecurso validarDependenciaServicoGenerico() {
		final String nomeRecursoGenerico = "EXEMPLO_CUSTOMIZACAO";
		return new IDependenciaRecurso() {

			@Override
			public boolean isRecursoDisponivel() {
				return LocalTime.now().isBefore(LocalTime.NOON);
			}

			@Override
			public TipoMetricaEnum getTipoMetrica() {
				return TipoMetricaEnum.DEPENDENCIA;
			}

			@Override
			public String getNomeRecurso() {
				return nomeRecursoGenerico;
			}
		};
	}

}
