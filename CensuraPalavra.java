import java.util.*;

/* 3. Censura de palavra — substituir ocorrências de uma palavra proibida por
"***" usando replace() */

public class CensuraPalavra {
    
    // Método Principal

    public static void main(String[] args) {
      System.out.println("Censura de Palavras \n");

      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o texto: ");
      String texto = sc.nextLine();

      // Chamada do método Censura

      String textocensurado = censurarPalavra(texto);
      System.out.println("O texto censurado é: \n" + textocensurado);
    }

    // Método Censura

    public static String censurarPalavra(String s){

      s = s.replace("merda", "***");
      return s;
    }
}