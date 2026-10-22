# **Lista de Exercícios - Polimorfismo**

## Exercício 2 – Polimorfismo em Coleções

Implemente um sistema de controle de despesas.

Classes:

- Despesa
  - Atributos: descricao, valor
  - Método calcularTotal() → retorna valor
  - 
- DespesaViagem
  - Atributos adicionais: valorPassagem, valorHospedagem
  - Sobrescreve calcularTotal() para retornar valor + valorPassagem + valorHospedagem

- DespesaAlimentacao
  - Atributo adicional: gorjeta
  - Sobrescreve calcularTotal() para retornar valor + gorjeta

Na classe principal, crie uma coleção (vetor) e adicione diferentes tipos de despesas.
Percorra a lista e exiba o total de cada despesa, usando o polimorfismo para chamar o método correto automaticamente.
