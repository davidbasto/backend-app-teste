# Scripts Liquibase

Este projeto contém os scripts de banco de dados a serem executados no liquibase. Ele deve estar de acordo com os padrões definidos na [wiki](https://san-doc.csjt.jus.br/index.php/Padroniza%C3%A7%C3%A3o_-_Introdu%C3%A7%C3%A3o#Controle_de_versionamento_BD).

## Como configurar

Crie uma cópia do arquivo `src/main/resources/liquibase.properties.template` sem a extenção ".template" e preencha as configurações.

Os scripts deste projeto estão definidos no arquivo `src/main/resources/rootchangelog.yml`

## Como executar

### Gerar script

O comando abaixo irá gerar o script de atualização em `target/liquibase/migrate.sql`. Assim é possível inspecionar o script gerado antes de executá-lo.

> `mvn liquibase:updateSQL`

### Atualizar banco

O comando abaixo aplica as mudanças no banco.

> `mvn liquibase:update`

