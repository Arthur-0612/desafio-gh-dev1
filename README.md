# desafio-gh-dev1



## desafio 1

Consumir um serviço de terceiro, que retornará uma lista dos estados do EUA, e salvar localmente para consulta local. 

Considerações sobre o consumo do serviço:

* endpoint: (metodo GET) https://www.healthcare.gov/api/states.json
* utilizar a classe RestTemplate do spring.
* deve-se armazenar o resultado (lista dos estados) em uma tabela no banco de dados local
* os atributos do resultado a serem armazenados devem ser apenas: title e url
* armazenar apenas os itens em que o atributo 'lang' for igual a 'en'
* antes de armazenar o resultado localmente, deve-se limpar os registros locais, caso exista.

Considerações sobre a interface (frontend):

* pode-se criar uma tela simples, baseada na tela person.html de modelo existente.
* a tela terá dois botões: 
* - Atualizar (que fará o processo de consumo do serviço)
* - Listar (lista os estados que estão salvos localmente)


## Ambiente base

O ambiente base desse projeto simula uma aplicação já existente e funcional, com conexão com banco de dados (em memória - H2).

Também está implementado uma lista simples de pessoas, para modelo de acesso ao banco local.

Para acessar a lista de pessoas, inicie a aplicação e acesse: http://localhost:8080/person.html

O banco de dados local da aplicação, é criado automaticamente (baseado nas entidades criadas) em memória no início da aplicação, pode ser acessado:
- acesse o endereço: http://localhost:8080/h2-console/
- setando o campo "JDBC URL"  para "jdbc:h2:mem:db"
- clique no botão "Connect"
