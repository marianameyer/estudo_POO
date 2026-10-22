// Classe Carrinho
class Carrinho{

  // Atributos
  int qtde = 0;
  Produto[] listaP = new Produto[10];

  // Métodos sobrecarregados

  public void adicionarProduto(Produto p){
    if(qtde < listaP.length){
      listaP[qtde] = p;
      qtde++;  // Atualiza o ponteiro e a quantidade de itens na lista
    }  
    else{
      System.out.println("Lista já está cheia!");
    }
  }

  public void adicionarProduto(String nome, double preco){
    if(qtde < listaP.length){
    Produto p = new Produto(nome, preco);
    listaP[qtde] = p;
    qtde++;
    }
    else{
      System.out.println("Lista já está cheia!");
    }
  }

  public void adicionarProduto(String nome, double preco,
  double taxaImportacao){
    if(qtde < listaP.length){
    ProdutoImportado pi = new ProdutoImportado(nome, preco, taxaImportacao);
    listaP[qtde] = pi;
    qtde++;
    }
    else{
      System.out.println("Lista já está cheia!");
    }
  }

  // Método para calcular o valor total 
  public double calcularTotal(){

    System.out.println("==================================");
    System.out.println("Resumo da Compra:");
    System.out.println("==================================");

    // Atributo 
    double total = 0.0;

    // Verificando se o vetor não está cheio 
    for(int i = 0; i < qtde; i++){
      System.out.printf("Produto: %s | Valor: R$ %.2f;\n", listaP[i].nome,
       listaP[i].preco);
      total += listaP[i].calcularPrecoFinal();
    }
    System.out.println("==================================");
    return total;
  }
}
