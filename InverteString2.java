import java.util.*;

/* 4. Desafio: inverter uma string manualmente, sem métodos prontos, usando
um laço 
Variação 2 */

public class InverteString2 {

    // Método Principal

    public static void main(String[] args) {
      
      System.out.println("Inversor de String");
      
      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a string que será invertida: ");
      String texto = sc.nextLine();

      // Chamando o método Inversor

      System.out.printf("A string invertida é: %s", inverterString(texto));
    }

    // Método Inversor

    public static String inverterString(String s){

      String si = new String("");

      // Nesse exemplo, faremos o contrário do exemplo anterior

      for(int i = s.length() - 1; i > -1; i--){

        si = si + s.charAt(i);

      }

      return si;

    }

}
