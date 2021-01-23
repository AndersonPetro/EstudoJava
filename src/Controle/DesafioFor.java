package Controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for ( int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
       }
        // Versao do desafio
        // Nao pode usar valor numerico pra compilar o laco!

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }

}
