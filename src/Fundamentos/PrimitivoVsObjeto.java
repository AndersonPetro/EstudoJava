package Fundamentos;

import java.util.Locale;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s =  new String("texto");
        s.toUpperCase();

        //Wrappers sao a cersao objeto dos tipos
        // primitivos!
        int a = 123;
        System.out.println(a);
    }
}
