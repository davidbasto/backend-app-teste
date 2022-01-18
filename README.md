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

---

## Implementações de Referência

### Implementando a API de Health Check
> //TODO

### Implementando a API de Métricas de Dependências

A implementação da API de dependências do módulo pode ser avaliada a partir da classe: (br.jus.csjt.backend.infra.ConfiguracaoDependenciasModulo.java)

**Endpoints de Teste**

* Endpoint das métricas: http://localhost:8080/backend-template-api/metrics

* Enpoint da versão do módulo: http://localhost:8080/backend-template-api/versao

---

### Versionando a Base de Dados com o Liquibase
O exemplo de versionamento da Base de Dados com Liquibase é apresentado no repositório: https://git.pje.csjt.jus.br/sistema-administrativo/arquitetura/backend-template-scripts

---

### Configurando Pipelines no Gitlab CI/CD

A configuração de pipelines nos projetos consiste na reutilização de pipelines básicas disponibilizadas no projeto (https://git.pje.csjt.jus.br/sistema-administrativo/infra/ci-jobs).

Deste modo, as configurações podem ser reutilizadas em todos os outros projetos, facilitando eventuais atualizações de forma centralizada para todos os Sistemas Administrativos Nacionais.

Maiores informações sobre a configuração de pipelines disponíveis no projeto: https://git.pje.csjt.jus.br/sistema-administrativo/infra/ci-jobs/-/blob/main/README.md

---

### Definição de Imagens Docker
A definição de imagens Docker está concentrada no diretório: `/docker`

Maiores informações: https://san-doc.csjt.jus.br/index.php/Guia_de_Desenvolvimento_Recomendado#Docker

### Implementando a API de Health Check
> //TODO

---

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
* https://san-doc.csjt.jus.br/index.php/Guia_de_Desenvolvimento_Recomendado
