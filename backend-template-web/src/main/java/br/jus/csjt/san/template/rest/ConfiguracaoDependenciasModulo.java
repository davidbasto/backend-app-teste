/**
 * 
 */
package br.jus.csjt.san.template.rest;

import java.util.Optional;

import br.jus.csjt.san.base.metricas.AbstractDependenciasModuloConfig;
import br.jus.csjt.san.base.metricas.IDependenciaRecurso;
import br.jus.csjt.san.base.metricas.enums.TipoMetricaEnum;

/**
 * @author alyssonribeiro
 *
 */
public class ConfiguracaoDependenciasModulo extends AbstractDependenciasModuloConfig{

    /**
     * @see br.jus.csjt.san.base.metricas.AbstractDependenciasModuloConfig#registrarDependencias()
     */
    @Override
    public void registrarDependencias() {
        adicionarDependencia(new IDependenciaRecurso() {
            
            @Override
            public boolean isRecursoDisponivel() {
                return checarRecursoDisponivel(getNomeRecurso());
            }
            
            @Override
            public TipoMetricaEnum getTipoMetrica() {
                return TipoMetricaEnum.PROPRIEDADE;
            }
            
            @Override
            public String getNomeRecurso() {
                return "usuario.smtp";
            }
        });
    }
    
    public boolean checarRecursoDisponivel(String nomePropriedade) {
        Optional<String> propriedade = this.extrairPropriedade(nomePropriedade);
        return propriedade.isPresent();
    }
    
    private Optional<String> extrairPropriedade(String nomePropriedade) {
        return Optional.ofNullable(System.getProperty(nomePropriedade));
    }
    
}
