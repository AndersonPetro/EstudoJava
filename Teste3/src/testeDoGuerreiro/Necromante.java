package testeDoGuerreiro;

public class Necromante extends Personagem{





    public Necromante(){

    }
    public Necromante(String nome, int level, float dinheiro, int atack, int defesa) {
        super("andy", 23, 5000, 35,80);
    }
    @Override
    public int atacar() {
     return 0;  
               //System.out.println("atack 30 pontos"+ this.getAtack());
    }



    @Override
    public int caminhar() {
        super.caminhar();
        return 0;
    }

    public void atackEspecial(){

    }
}

