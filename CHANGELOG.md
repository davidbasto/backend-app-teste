## Changelog

## 0.0.4 (16/08/2021)
* Migração do projeto de scripts para repositório separado;
* Configuração de profile `release` para gerar os artefatos no diretório: `deploy` utilizado nas pipelines;

## 0.0.3 (04/06/2021)
* Reaproveitamento de configuração da pipeline através do projeto CI-Jobs;
* Implementação da classe de métricas e dependências do módulo;
* Configuração do arquivo (aplicacao.properties) para armazenar informações do módulo;
* Renomeção dos artefatos.

## 0.0.2 (24/05/2021)
* Configuração da pipeline para possibilitar o "build" e publicação das imagens Docker no Registry do CSJT;
	* Os jobs de criação das imagens Docker são executador somente nas tags no formato: **(release/x.x.x)**

## 0.0.1 (17/05/2021)
 * Implementação inicial do projeto de referência;
 * Configuração das pipelines "build" e "test" no Gitlab;