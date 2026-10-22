import java.util.*;

public class Main {

    public static void main(String[] args) {

      System.out.println("===== Sistema de Pedidos =====\n");

      // Criando o vetor carrinho
      Carrinho carrinho = new Carrinho();

      // Populando o vetor 
      Produto p1 = new Produto("Caneta", 2.50);

      // Adicionando produtos ao carrinho
      carrinho.adicionarProduto(p1);
      carrinho.adicionarProduto("Caderno", 4.50);
      carrinho.adicionarProduto("Tamagochi", 55.00, 9.80);
      
      // Total do carrinho 
      double result = carrinho.calcularTotal();
      System.out.printf("Total: R$ %.2f.", result);
    }
}
