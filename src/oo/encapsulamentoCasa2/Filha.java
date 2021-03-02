package oo.encapsulamentoCasa2;

import oo.encapsulamento2Casa1.Sogra;
import oo.encapsulamento2Casa1.Sogro;

public class Filha extends Sogra {

    String segredoDoCasal = "Meu marido esta quase sendo demitido";

    public static void main(String[] args) {
        Filha euMesma = new Filha();
        System.out.println("Meus pais nao sabem... " + euMesma.segredoDoCasal);
        System.out.println(euMesma.segredoDeFamilia);

        //Genro meuAmor = new Genro();
        //System.out.println(meuAmor.segredo);

        Sogro pai = new Sogro();
        System.out.println(pai.gostaDeCerveja);

        Sogra mae = new Sogra();
        //System.out.println(mae.segredoDeFamilia);

    }
}
