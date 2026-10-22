// Classe mãe 
class Despesa{

  // Atributos
  String descricao;
  double valor;

  // Construtor
  public Despesa(String descricao, double valor){
    this.descricao = descricao;
    this.valor = valor;
  }

  // Método para calcular valor 
  public double calcularTotal(){
    System.out.print(descricao);
    return valor;
  }
}

// Subclasses
class DespesaViagem extends Despesa{

  // Atributos
  double valorPassagem;
  double valorHospedagem;

  // Construtor
  public DespesaViagem(String descricao, double valor, 
  double valorPassagem, double valorHospedagem){
    super(descricao, valor);
    this.valorPassagem = valorPassagem;
    this.valorHospedagem = valorHospedagem;
  }

  // Sobreescrita do método 
  @Override
  public double calcularTotal(){
    System.out.print(descricao);
    return (valor + valorPassagem + valorHospedagem);
  }
}

class DespesaAlimentacao extends Despesa{

  // Stributo 
  double gorjeta;

  // Construtor 
  public DespesaAlimentacao(String descricao, double valor,
  double gorjeta){
    super(descricao, valor);
    this.gorjeta = gorjeta;
  }

  // Sobreescrita
  @Override
  public double calcularTotal(){
    System.out.print(descricao);
    return (valor + gorjeta);
  }
}