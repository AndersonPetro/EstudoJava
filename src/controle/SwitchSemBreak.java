package controle;



public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";
        switch (faixa.toLowerCase()) {
        case "preta":
                System.out.println("sei o Bassei-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Sandan");
            case  "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o heian Shodan");
                break;
            default:
                System.out.println("Nao sei nada");

        }
        System.out.println("Fim!");
        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("sabe falar");
            case 1:
                System.out.println("sabe andar");
            case 0:
                System.out.println("Sabr respirar");
        }

    }
}
