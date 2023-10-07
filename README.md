TODO List

API para gerenciar tarefas (CRUD).

Tecnologias
* Spring Boot
* Spring MVC
* Spring Data JPA
* SpringDoc OpenAPI 3
* mySQL

Práticas adotadas
* API REST
* Consultas com Spring Data JPA
* Injeção de Dependências
* Tratamento de respostas de erro
* Geração automática do Swagger com a OpenAPI 3

Como Executar
1. Clonar repositório git
2. Descompactar a pasta do arquivo
3. Abrir a pasta na sua IDE de preferência
4. Executar o arquivo TodolistApplication

A API poderá ser acessada em http://localhost:8080/todos ou pelo Swagger onde poderá ser visualizado em http://localhost:8080/swagger-ui/index.html

API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman:

* Para criar uma tarefa foi utilizado o método POST passando no corpo da requisição um arquivo JSON contendo o nome, descrição e prioridade.
* Para a listagem de tarefas foi utilizado o método GET onde será retornado as tarefas em ordem descendente de prioridade e ordem ascendente de nome.
* Para atualizar a tarefa foi utilizado o método PUT passando no corpo da requisição o id e os valores que deseja atualizar.
* Para deleção de uma tarefa foi utilizado o método DELETE passando como parâmetro o id no qual deseja excluir.
