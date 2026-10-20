# **Lista de Exercícios - Polimorfismo**

## Exercício 1 – Sobrescrita com Herança

Implemente um sistema simples de transporte de passageiros.

Classes:

- Transporte
  - Atributos: capacidade, valorBase
  - Método: calcularTarifa() → retorna valorBase
  - 
- Onibus (herda de Transporte)
  - Atributo adicional: quantidadeParadas
  - Sobrescreve calcularTarifa() → retorna valorBase + (quantidadeParadas * 0.50)
  - 
- Taxi (herda de Transporte)
  - Atributo adicional: quilometragem
  - Sobrescreve calcularTarifa() → retorna valorBase + (quilometragem * 2.00)
  - 
Crie uma classe ControleTransporte que possua um ArrayList<Transporte> e um método mostrarTarifas() que percorra
a lista e exiba o valor da tarifa para cada tipo de transporte, demonstrando polimorfismo de sobrescrita.

*Obs*.: Como ainda não estudei estruturas dinâmicas, fiz usando um vetor.
