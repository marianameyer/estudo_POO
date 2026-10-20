// Classe mãe
class Personagem{

  String nome;

  // Construtor
  public Personagem(String nome){
    this.nome = nome;
  }

  // Método para atacar
  public void atacar(){
    System.out.printf("%s ataca!", nome);
  }

  // Método para retornar o nome
  @Override
  public String toString(){
    return nome;
  }
}

// Subclasses
class Guerreiro extends Personagem{

  public Guerreiro(String nome){
    super(nome);
  }

  @Override
  public void atacar(){
    System.out.println(" empunhou a espada!\n");
  }
}

class Mago extends Personagem{

  public Mago(String nome){
    super(nome);
  }

  @Override
  public void atacar(){
    System.out.println(" atacou com o cajado!");
  }

  // Método exclusivo do Mago
  public void lancarFeitico(){
    System.out.println(" lançou feitiço!\n");
  }

}

class Arqueiro extends Personagem{

  public Arqueiro(String nome){
    super(nome);
  }

  @Override
  public void atacar(){
    System.out.println(" lançou flechas!\n");
  }

}
