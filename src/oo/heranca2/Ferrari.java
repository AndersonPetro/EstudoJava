package oo.heranca2;

public class Ferrari extends Carro{
    public Ferrari(){
        VELOCIDADE_MAXIMA = 350;
    }
    public void acelerar(){
        super.acelerarMais(20);
    }
}
