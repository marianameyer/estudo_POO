import java.util.*;

/* 4. Desafio: inverter uma string manualmente, sem métodos prontos, usando
um laço */

public class InverteString {

    // Método Principal

    public static void main(String[] args) {
      System.out.println("Inversor de String");

      // Objeto Scanner

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a string a ser invertida: ");
      String texto = sc.nextLine();

      //Chamada do método Inversor

      System.out.printf("A string invertida fica: \n%s", inversorString(texto));

    }

  // Método Inversor

    public static String inversorString(String s){

      String si = new String();

      for(int i = 0; i < s.length(); i++){

        si = si + s.charAt(s.length() - 1 - i);

      }

      return si;

    }
}