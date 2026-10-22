# **Lista de Exercícios - Polimorfismo**

## Exercício 3 – Pequeno Sistema

Crie um pequeno sistema de pedidos com as seguintes classes:

- Produto
  - Atributos: nome, preco
  - Método: calcularPrecoFinal() → retorna preco

- ProdutoImportado (herda de Produto)
  - Atributos: taxaImportacao
  - Sobrescreve calcularPrecoFinal() → preco + taxaImportacao

- Carrinho
  - Atributo: vetor de Produto
  - Métodos sobrecarregados:
    - adicionarProduto(Produto p)
    - adicionarProduto(String nome, double preco)
    - adicionarProduto(String nome, double preco, double taxaImportacao) (cria ProdutoImportado)

Desafio:
Crie uma aplicação que leia produtos e mostre o valor total do carrinho,
demonstrando polimorfismo de sobrescrita e sobrecarga de métodos.
