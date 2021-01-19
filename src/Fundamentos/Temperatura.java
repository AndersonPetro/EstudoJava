package Fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32 ;

        double fahrenheit = 86;
        double celsius  = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado e " + celsius + "°C.");

        fahrenheit  = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado e " + celsius + "°C.");
        }
    }


