import java.util.*;

// Ler	uma	palavra	e	informar	se	ela	é	um	palíndromo	(lê-se	igual	de trás	para 
// frente),	ignorando	maiúsculas/minúsculas.

public class Palindromo {
    
    // Método Principal

    public static void main(String[] args) {
      System.out.println("Programa para verificar se a palavra é um palíndromo. \n");

      // Objeto scanner
      Scanner sc = new Scanner(System.in);

      // Entrada de dado do usuário
      System.out.println("Digite uma palavra: ");
      String palavra = sc.next().toLowerCase();

      // Chamada do método
      System.out.println(ehPalindromo(palavra) ? "É palíndromo." : "Não é palíndromo.");
    }

  // Método verificador

  public static boolean ehPalindromo(String s){

    // Verifica se não é palíndromo 

    for(int i = 0; i < s.length()/2; i++){

      if(s.charAt(i) != s.charAt(s.length() - i -1)){
        return false;
      }
    }

    return true;
  }
}