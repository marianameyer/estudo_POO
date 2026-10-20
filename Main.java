import java.util.*;

public class Main {

    public static void main(String[] args) {

      System.out.println("====== Jogo de RPG ======\n");
      System.out.println("Criando personagens...\n");

      // Criando e populando o vetor de personagens
      Personagem[] personagens = new Personagem[4];
      personagens[0] = new Mago("Gandalf");
      personagens[1] = new Arqueiro("Legolas");
      personagens[2] = new Guerreiro("Aragorn");
      personagens[3] = new Mago("Saruman");

      // Loop para todos os personagens atacarem
      for(int i = 0; i < personagens.length; i++){
        System.out.print(personagens[i]);
        personagens[i].atacar();

        // Se Mago -> lanaFeitico() também
        if(personagens[i] instanceof Mago){
          Mago m = (Mago) personagens[i];
          System.out.print(personagens[i]);
          m.lancarFeitico();
        }

      }

    }
}