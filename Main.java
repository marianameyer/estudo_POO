import java.util.*;

public class Main {

    public static void main(String[] args) {

      System.out.println("===== Sistema de Controle de Despesas =====\n");

      // Criando o vetor
      Despesa[] despesas = new Despesa[3];

      // Populando o vetor 
      despesas[0] = new Despesa("Farmácia", 34.50);
      despesas[1] = new DespesaViagem("São Paulo", 500.00, 350.00, 220.00);
      despesas[2] = new DespesaAlimentacao("Restaurante", 55.00, 5.50);

      // Exibindo as despesas 
      System.out.println("Despesas:");
      for(int i = 0; i < despesas.length; i++){
        System.out.printf(": R$ %.2f;\n", despesas[i].calcularTotal());
      }
    }
}