CRUD de Clientes com Spring Boot

Este projeto consiste em uma API REST desenvolvida com Java e Spring Boot para realizar operações CRUD (Create, Read, Update e Delete) de clientes.

A proposta é demonstrar o funcionamento de uma API REST, a organização do código em camadas e a utilização dos métodos HTTP para manipulação de dados.

Tecnologias utilizadas

* Java 25
* Spring Boot
* Spring Web
* Maven
* Postman para testes

Funcionalidades

* Cadastrar clientes.
* Listar todos os clientes.
* Buscar clientes pelo nome.
* Buscar um cliente pelo identificador.
* Atualizar os dados de um cliente.
* Excluir um cliente.

Organização do projeto

O código é organizado em quatro camadas:

* Model: representa os dados do cliente.
* Controller: recebe as requisições HTTP.
* Service: contém a lógica da aplicação.
* Repository: armazena e consulta os dados.

Armazenamento dos dados

Os dados são mantidos em uma estrutura em memória, sem a utilização de um banco de dados externo. Por isso, os registros são perdidos quando a aplicação é encerrada.

Documentação

O arquivo java-springboot.md contém a documentação do projeto, os códigos das classes e os exemplos de requisições HTTP para testar as operações CRUD.

Objetivo

Praticar os conceitos de desenvolvimento de APIs REST com Java e Spring Boot, compreendendo a comunicação entre as camadas da aplicação e as operações básicas de manipulação de dados.
