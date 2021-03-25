package oo.heranca.exemplo2;

public abstract class Conta {
    private  double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract void imprimeExtrato();
}