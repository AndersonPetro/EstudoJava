package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Mostro monstro = new Mostro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10 , 11);
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.life);
        System.out.println(heroi.life);

        System.out.println("Monstro tem ==> " + monstro.life);
        System.out.println("Heroi tem ==> " + heroi.life);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("Monstro tem ==> " + monstro.life);
        System.out.println("Heroi tem ==> " + heroi.life);

    }

}
