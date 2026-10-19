import java.util.*;

// 2. Validação simples de e-mail — verificar se o texto contém "@" e "."

public class ValidadorEmail {

    // Método Principal

    public static void main(String[] args) {
      System.out.println("Validador de e-mail \n");

      // Objeto scanner

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um e-mail para verificação: ");
      String email = sc.nextLine();

      // Chamada do método
      System.out.println(validaEmail(email) ? "É válido" : "Não é válido.");

    }

  // Método verificador

  public static boolean validaEmail(String s){

    // Verificando se há os caracteres @ e .
    if(s.contains("@") && s.contains(".")){
      return true;
    }
    return false;
  }
}