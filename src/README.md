# DESIGN PATTERNS

# Soluções padrões para problemas comuns.

 - Patterns Criacionais (Criação de objetos).
 - Patterns Estruturais (Estruturação de código, heranças, interfaces).
 - Patterns Comportamentais (Como os objetos se comportam entre si).
 
No café de hoje vamos começar a ver os Patterns Criacionais.

1 - Builder

 - Proporciona a criação de objetos de maneira mais legivel, trabalhando com a interface fluente.

Benefícios:

* Criação de objetos de forma mais legível, poupando a memória do programador.
* Flexibilidade na criação de objetos, em relação a ordme de atributos.
* Centralização na criação dos objetos.


-----------------------------------------------------------------------------------------------------------------------------


2 - Static Factory Methods

 - Proposciona a criação de objetos através de métodos estaticos que funcionam como fabrica de objetos.

Benefícios:

* Controla a devolução do tipo de intancias.
* Proporciona maior legibilidade na criação dos objetos, por causa do nome do metodo.
* Encapsula e centraliza lógica de negócio.

-----------------------------------------------------------------------------------------------------------------------------


3 - Singleton

 - Mantem apenas uma instância do objeto na memória.

Benefícios:

* Mantem apenas uma intancia do objeto na memória (quando fizer sentido).
* Economiza espaço na memória HEAP.
* Util para classes uteis
* Usado em injeção de dependencias pelo CDI (@Inject) do Java EE, @Autowired do Spring (todo que for anotado como @Component)

-----------------------------------------------------------------------------------------------------------------------------


PARA SABER MAIS:
- https://refactoring.guru/design-patterns




