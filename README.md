# O que é ?
Este repositório tem como objetivo servir como referência de implementação para as padronizações no desenvolvimento dos Sistemas Administrativos Nacionais, os quais são acompanhados pela CSAN - Coordenadoria de Sistemas Administrativos Nacionais.

## Pré-requisitos

* OpenJDK 11;
* Maven 3.0 ou superior;
* Wildfly 22 ou superior (https://www.wildfly.org/news/2021/02/11/WildFly2201-Released/ );

### Tecnologias 

* Java EE 7 
* JSF 2.2;
* CDI 1.1;
* EJB 3.2;
* JPA 2.1 e Bean Validation 1.1;

## Changelog

### - 0.0.3 - 04/06/2021
- Reaproveitamento de configuração da pipeline através do projeto CI-Jobs;
- Implementação da classe de métricas e dependências do módulo;
- Configuração do arquivo (aplicacao.properties) para armazenar informações do módulo;
- Renomeção dos artefatos.

### - 0.0.2 - 24/05/2021
- Configuração da pipeline para possibilitar o "build" e publicação das imagens Docker no Registry do CSJT;
	- Os jobs de criação das imagens Docker são executador somente nas tags no formato: **(release/x.x.x)**

### - 0.0.1 - 17/05/2021
 - Implementação inicial do projeto de referência;
 - Configuração das pipelines "build" e "test" no Gitlab;

## Implementações de Referência

### Implementando a API de Health Check
> //TODO
### Implementando a API de Métricas de Dependências

A implementação da API de dependências do módulo pode ser avaliada a partir da classe: (br.jus.csjt.san.template.infra.ConfiguracaoDependenciasModulo.java)

**Endpoints de Teste**

* Endpoint das métricas: http://localhost:8080/backend-template-api/metrics

* Enpoint da versão do módulo: http://localhost:8080/backend-template-api/api/versao

### Versionando a Base de Dados com o Liquibase
> //TODO

### Configurando Pipelines no Gitlab CI/CD

A configuração básica da pipeline está reutilizando pipelines básicas definidas no projeto (https://git.pje.csjt.jus.br/sistema-administrativo/infra/ci-jobs).

Deste modo, as configurações podem ser reutilizadas em todos os outros projetos, facilitando eventuais atualizações de forma centralizada para todos os Sistemas Administrativos Nacionais.

#### JOBs básicos configurados na Pipeline

**1) Stage: Build**

Quando: Em todas as execuções da pipeline este job será executado.

> Realiza a compilação do projeto.

**2) Stage: Test**

Quando: Em todas as execuções da pipeline este job será executado.

> Realiza a validação dos testes unitários.  

**3) Stage: Pre-Release**

-Job: Aprovar-Release

Quando: Após aprovação Manual (Disponível apenas nas branches `main` e `develop`.

> Realiza a preparação da Release e cria uma tag no formato: "release/x.y.z".
 
#### JOBs de Release

**4) Stage: Release**

-Job: Release-Package-Nexus

Quando: Disparado na criação de uma tag no padrão "release/x.y.z".
> Realiza a publicação dos artefatos da aplicação no repositório Nexus: http://portal.pje.redejt/nexus/service/rest/repository/browse/releases-administrativo

**5) Stage: Docker**

-Job: Publish-Imagem-Docker
Quando: Disparado na criação de uma tag no padrão "release/x.y.z".
> Realiza a compilação e publicação da imagem Docker no Registry: https://registry.csjt.redejt/
### Definição de Imagens Docker

## Executando a Aplicação

1. Inicialize o servidor de aplicações configurado.
2. Os comandos abaixo demonstram como iniciar o serviço:

> Para Linux: JBOSS_HOME/bin/standalone.sh
> Para Windows: JBOSS_HOME\bin\standalone.bat

### Implantando o Projeto no Servidor de Aplicações

Para implantar o projeto, basta apenas executar o comando abaixo após a inicialização do servidor de aplicações.

1. Confirme que o servidor de aplicações Wildfly já foi inicializado.
2. Abra o terminal e execute o comando abaixo para compilar e implantar o artefato no servidor;

> mvn clean package wildfly:deploy 

3. Este comando irá implantar o arquivo `target/backend-template.api.war` na instância do servidor de aplicações em execução.

### Acessando a Aplicação
  
A aplicação está rodando na seguinte URL:  <http://localhost:8080/backend-template-api>

### Desimplantar a Aplicação

Execute o comando abaixo da desfazer a implantação da aplicação no servidor de aplicações:  
  
> mvn wildfly:undeploy

## Referência
* https://github.com/wildfly/quickstart/
