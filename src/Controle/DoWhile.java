package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //if(..) sentenca; ou {}
        //while(...)sentenca; ou {}
        // for(...; ...; ...) sentenca; ou {}

        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Voce precisa falar " +
                    "as palavras magicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("obrigado");
        entrada.close();
    }
}
