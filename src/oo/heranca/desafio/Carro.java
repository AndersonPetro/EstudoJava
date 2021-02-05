package oo.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    int delta = 5;

    protected Carro(int velocidadeMaxima) {

        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }


    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual eh " + velocidadeAtual + "Km/h.";
    }

    public int delta() {
        return 5;
    }
}



