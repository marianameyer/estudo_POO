// Classe mãe
class Produto{

  // Atributos
  String nome;
  double preco;

  // Construtor
  public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
  }

  // Método para calcular o preço final 
  public double calcularPrecoFinal(){
    return preco;
  }
}

// Subclasse
class ProdutoImportado extends Produto{

  // Atributo
  double taxaImportacao;

  // Construtor
  public ProdutoImportado(String nome, double preco, 
  double taxaImportacao){
    super(nome, preco);
    this.taxaImportacao = taxaImportacao;
  }

  // Sobrescrita de método 
  @Override
  public double calcularPrecoFinal(){
    return (preco + taxaImportacao);
  }
}
