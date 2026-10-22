// Classe Mãe
class Transporte{

  // Atributos 
  int capacidade;
  double valorBase;

  // Construtor
  public Transporte(int capacidade, double valorBase){
    this.capacidade = capacidade;
    this.valorBase = valorBase;
  }

  // Método para calcular tarifa
  public double calcularTarifa(){
    return valorBase;
  }
}

// Subclasses
class Onibus extends Transporte{

  // Atributo 
  int quantidadeParadas;

  // Construtor
  public Onibus(int capacidade, double valorBase, int quantidadeParadas){
    super(capacidade, valorBase);
    this.quantidadeParadas = quantidadeParadas;
  }

  // Método sobrescrito 
  @Override
  public double calcularTarifa(){
    return (valorBase + (quantidadeParadas * 0.50));
  }
}

class Taxi extends Transporte{

  // Atributo 
  double quilometragem;

  // Construtor 
  public Taxi(int capacidade, double valorBase, double quilometragem){
    super(capacidade, valorBase);
    this.quilometragem = quilometragem;
  }

  // Método sobrescrito 
  @Override
  public double calcularTarifa(){
    return (valorBase + (quilometragem * 2.00));
  }
}
