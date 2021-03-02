package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
         // Informacoes do funcionarios

        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumulados = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        //Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumulados);

        System.out.println(id + ": ganha ->" + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
