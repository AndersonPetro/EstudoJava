package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; //implicits
        System.out.println(a);

        float b = (float) 1.123456788888; // Explicita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // Explicita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Explicita (CAST)
        System.out.println(f);
        }

    }

