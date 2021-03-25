package oo.heranca;

public class Jogador {
    int life = 100;
    int posicaoX;
    int posicaoY;

    Jogador(int posicaoX, int posicaoY){
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(posicaoX - oponente.posicaoX);
        int deltaY = Math.abs(posicaoY - oponente.posicaoY);

        if (deltaX == 0 && deltaY == 1) {
            oponente.life -= 10;
            return true;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.life -= 10;
            return true;
        }else{
            return false;
        }

    }

    boolean andar (Direcao direcao){
        switch (direcao){
            case NORTE:
                posicaoY--;
                break;
            case LESTE:
                posicaoX++;
                break;
            case SUL:
                posicaoY++;
                break;
            case OESTE:
                posicaoX--;
                break;

        }
        return true;

    }
}
