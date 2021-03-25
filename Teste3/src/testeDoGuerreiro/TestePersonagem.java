package testeDoGuerreiro;

import java.util.Scanner;

public class TestePersonagem {



    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.println("Mostra os atributos dos Personagem: " );

       String nome = entrada.next();
       int level = entrada.nextInt();
       float dinheiro = entrada.nextFloat();
       int attack = entrada.nextInt();
       int defesa = 23;

      Guerreiro guerreiro = CriarPersonagem.criarGuerreiro(nome, level, dinheiro, attack);
      var escudo = "Escudo";
       var espada = "Espada";

       guerreiro.addInventario(espada);
       guerreiro.addInventario(escudo);
       System.out.println(" Inventario atual");
       guerreiro.getInventario().forEach(value -> System.out.println(" items -> ".concat(value)));

       System.out.println("Verifica se o item esteja no inventario ".concat(espada));
       System.out.println(guerreiro.itemExitente(espada));

       System.out.println("Verifica se o item esteja no inventario ".concat(escudo));
       System.out.println(guerreiro.itemExitente(escudo));
       System.out.println(guerreiro.toString());


       System.out.println(" Removendo o item ".concat(escudo));

       guerreiro.removeInventario(escudo);

       System.out.println(" Inventario atual");

       guerreiro.getInventario().forEach(value -> System.out.println(" items -> ".concat(value)));
       Necromante necromante = CriarPersonagem.criarNecromante(nome , level , dinheiro, attack);


       entrada.close();
    }




}
