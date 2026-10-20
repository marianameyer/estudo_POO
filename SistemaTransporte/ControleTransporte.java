// Classe de controle de transportes 
class ControleTransporte{

  // Atributos 
  private Transporte[] listaTransportes;
  private int qtde;  // Tbm servirá como contador

  // Construtor 
  public ControleTransporte(int capacidadeMax){
    this.listaTransportes = new Transporte[capacidadeMax];
    this.qtde = 0;
  }

  // Método para adicionar elementos ao vetor 
  public void adicionarTransporte(Transporte t){
    if(qtde < listaTransportes.length){
      listaTransportes[qtde] = t;
      qtde++;  // Atualizamos o contador
    }
    else{
      System.out.println("Vetor cheio!");
    }
  }

  // Método para exibir as tarifas
  public void mostrarTarifas(){
    System.out.println("=== Tarifas ===");

    // Loop para varrer o vetor 
    for(int i = 0; i < qtde; i++){
      System.out.printf("Tarifa: R$ %.2f;\n", listaTransportes[i].calcularTarifa());
    }
  }

}
