# Scripts Liquibase

Este projeto contém os scripts de banco de dados a serem executados com Liquibase. Ele deve estar de acordo com os padrões definidos na [wiki](https://san-doc.csjt.jus.br/index.php/Padroniza%C3%A7%C3%A3o_-_Introdu%C3%A7%C3%A3o#Controle_de_versionamento_BD).

## Ferramentas envolvidas

* Liquibase 4.4.0 (https://www.liquibase.org/download)

## Como configurar

As configurações de conexão estão presentes no arquivo: `src/main/resources/liquibase.properties`.

Os scripts deste projeto estão definidos no arquivo `src/main/resources/rootchangelog.yml`

## Como executar

### Gerar script

O comando abaixo irá gerar o script de atualização em `target/liquibase/migrate.sql`. Assim é possível inspecionar o script gerado antes de executá-lo.

> `mvn liquibase:updateSQL`

### Atualizar banco

O comando abaixo aplica as mudanças no banco.

> `mvn liquibase:update`

