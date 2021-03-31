package testeDoGuerreiro;

public class CriarPersonagem {
   public static Guerreiro criarGuerreiro(String nome, int level, float dinheiro, int attack) {
        var defesa = 30;
        return new Guerreiro();

    }

    public static Necromante criarNecromante(String nome, int level, float dinheiro, int attack) {
        var defesa = 35;
        return new Necromante(nome, level, dinheiro, attack,defesa);

    }
}
