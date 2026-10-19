import java.util.*;

public class ExercicioAvaliativo1 {

    //Método Principal

    public static void main(String[] args) {

      System.out.println("=== Exercício Avaliativo 1 - POO ===\n");

      // Declaração de variáveis
      String texto = new String();

      // Objeto Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o texto: ");
      texto = sc.nextLine().trim();
      System.out.print("Digite o caractere a ser buscado: ");
      char letra = sc.next().trim().charAt(0);

      // Chamada dos métodos
      System.out.println("\nTexto: " + texto);
      System.out.println("Caractere buscado: " + letra);
      System.out.println("Quantidade de vezes que aparece: " + contarCaractereEspecifico(texto, letra));
      System.out.println("Quantidade de grupos repetidos: " + contarGruposRepetidos(texto));
      System.out.println("Caractere mais repetido consecutivamente: " + caractereMaisRepetidoConsecutivamente(texto));
      System.out.println("Texto invertido: " + inverterString(texto));

    }

    // Método contar caractere

    public static int contarCaractereEspecifico(String texto, char letra){

      int contchar = 0;  // Contador
      for(int i = 0; i < texto.length(); i++){
        if(texto.charAt(i) == letra){
          contchar += 1;
        }
      }
      return contchar;
    }
    
    // Método contar grupos repetidos
    
    public static int contarGruposRepetidos(String texto){

      int contgrupos = 0;  // Contador
      for(int i = 0; i < texto.length() - 1; i++){
        if(texto.charAt(i) == texto.charAt(i+1)){
          contgrupos += 1;
          while((i < texto.length() - 1) && (texto.charAt(i) == texto.charAt(i+1))){
            i++;  // Enquanto a letra é a mesma, força o contador seguir adiante
          }
        }
      }
      return contgrupos;
    } 

    // Método caractere mais repetido
    
    public static char caractereMaisRepetidoConsecutivamente(String texto){

      char caractereatual = texto.charAt(0);  // Primeiro caractere para comparação
      int contatual = 1;  // O primeiro caractere apareceu 1 vez já
      char caracteremaisrepetido = texto.charAt(0);  // Como é o primeiro analisado, é o que mais apareceu
      int contmaisrepetido = 1;  // O caractere que mais apareceu já possui 1 contagem

      for(int i = 1; i < texto.length(); i++){  // Tenho que tirar o primeiro char, pois ele já foi analisado
        char letra = texto.charAt(i);
        if(letra == caractereatual){
          contatual ++;
        }
        else{
          caractereatual = letra;
          contatual = 1;  // Como foi detectado outra letra, o contador volta ao início
        }

        if(contatual > contmaisrepetido){
          contmaisrepetido = contatual;
          caracteremaisrepetido = caractereatual;
        }
      }
      return caracteremaisrepetido;
    }

    // Método para inverter string 

    public static String inverterString(String texto){

      String textoinvertido = new String();
      for(int i = 0; i < texto.length(); i++){
        textoinvertido += texto.charAt(texto.length()-1-i);
      }
      return textoinvertido;
    }
}