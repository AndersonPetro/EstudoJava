package oo.heranca.exemplo2;

public class TestaConta {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();

    }
}
