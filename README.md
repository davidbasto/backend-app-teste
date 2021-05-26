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
> //TODO
### Versionando a Base de Dados com o Liquibase
> //TODO
### Configurando Pipelines no Gitlab CI/CD
> //TODO
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

3. Este comando irá implantar o arquivo `target/backend-template.ear` na instância do servidor de aplicações em execução.

### Acessando a Aplicação
  
A aplicação está rodando na seguinte URL:  <http://localhost:8080/backend-template-web>

1. Enter a name, email address, and Phone nubmer in the input field and click the _Register_ button.

2. If the data entered is valid, the new member will be registered and added to the _Members_ display list.

3. If the data is not valid, you must fix the validation errors and try again.

4. When the registration is successful, you will see a log message in the server console:

### Desimplantar a Aplicação

Execute o comando abaixo da desfazer a implantação da aplicação no servidor de aplicações:  
  
> mvn wildfly:undeploy

  ### Executando Testes com Arquillian 

This quickstart provides Arquillian tests. By default, these tests are configured to be skipped as Arquillian tests require the use of a container.

_NOTE: The following commands assume you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Run the Arquillian Tests](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/RUN_ARQUILLIAN_TESTS.md) for complete instructions and additional options._

1. Make sure you have started the JBoss Server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. Type the following command to run the test goal with the following profile activated:

> mvn clean test -Parq-wildfly-remote

## Referência
* https://github.com/wildfly/quickstart/