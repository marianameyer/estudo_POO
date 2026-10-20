import java.util.*;

public class Main {

    public static void main(String[] args) {
      
      System.out.println("===== Sistema de Transportes =====");

      // Criando o vetor de transportes de tamanho 5
      ControleTransporte ct = new ControleTransporte(5);

      // Populando o vetor de transportes 
      ct.adicionarTransporte(new Onibus(44, 3.50, 4));
      ct.adicionarTransporte(new Taxi(4, 5.00, 20.00));
      ct.adicionarTransporte(new Transporte(2, 7.00));
      ct.adicionarTransporte(new Taxi(3, 5.00, 50.00));

      // Mostrar tarifas
      ct.mostrarTarifas();

    }
}