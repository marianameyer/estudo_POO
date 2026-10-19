import java.util.*;

// 1. Contar vogais — dada uma frase, contar quantas vogais ela contém

public class ContaVogais {
    
    // Método Principal

    public static void main(String[] args) {
      
      System.out.println("Programa para contar vogais \n");

      // Objeto scanner
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma frase: ");
      String frase = sc.nextLine().toLowerCase().trim().replace(" ","");

      // Chamada do método
      System.out.println("A frase contém " + contaVogais(frase) + " vogais.");
    }

  // Método contaVogais

  public static int contaVogais(String f){

    // Contador de vogais
    int cont = 0;

    for(int i = 0; i < f.length(); i++){

      if(f.charAt(i) == 'a' || f.charAt(i) == 'e' || f.charAt(i) == 'i' || f.charAt(i) == 'o' || f.charAt(i) == 'u'){
        
        cont += 1;

      }     
    }
    return cont;
  }
}