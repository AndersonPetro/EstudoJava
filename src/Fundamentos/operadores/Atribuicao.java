package Fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

       c += b; //a mesma coisa que  c = c + b ;
       c -= a; //a mesma coisa que c = c - a;
       c *= b; // a mesma coisa que c = c * b;
       c /= a; // a mesma coisa que c = c / a;

        System.out.println(c);

        c %= 2; // c = c % 2; 0 ou 1
        System.out.println(c);

    }
}
