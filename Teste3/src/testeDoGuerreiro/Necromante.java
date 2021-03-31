package testeDoGuerreiro;

public class Necromante extends Personagem{

    private final int inteligencia;



    public Necromante(int inteligencia){

        this.inteligencia = inteligencia;
    }
    public Necromante(String nome, int level, float dinheiro, int atack, int defesa) {
        super("andy", 23, 5000, 35,80);
        this.inteligencia = 60;
    }
    @Override
    public int atacar() {
     return 35;
               //System.out.println("atack 30 pontos"+ this.getAtack());
    }



    @Override
    public int caminhar() {
        super.caminhar();
        return 0;
    }

    public int atackEspecial(){
        return this.inteligencia;

    }
}

