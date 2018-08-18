# Cadastro-Rest
Cadastro Simples em JPA com Spring

## Como funciona:
**Crie o banco de dados "cadastro"**

`create database cadastro`


**No arquivo `application.properties`:**

altere os valores de `spring.datasource.username` e `spring.datasource.password` de acordo com as configurações de instalação do seu MySql


## Como consumir o serviço:
**O caminho padrão para a API é:**

+ `http://localhost:8080/api`


**Função Listar tudo (GET):**

+ `http://localhost:8080/api/produto`


**Função Listar um valor especifico (GET), onde "{id}" é o valor:**

+ `http://localhost:8080/api/produto/{id}`


**Função Cadastrar (POST):**

+ `http://localhost:8080/api/produto`
+ Exemplo json: { "nome": "pimenta", "descricao": "top"}


**Função Alterar (PUT), onde "{id} é o valor:**

+ `http://localhost:8080/api/produto/{id}`
+ Exemplo: { "nome": "pimentis", "descricao": "ardidis"}


**Função Deletar (DELETE), onde "{id}" é o valor:**

+ `http://localhost:8080/api/produto/{id}`
