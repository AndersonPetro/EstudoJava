package testeDoGuerreiro;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {


    private int ataqueEspecial;
    private final List<String> inventario ;

    public Guerreiro() {
        super("Noa", 30, 1000, 80, 30);
       this.inventario= new ArrayList<>();
       this.ataqueEspecial = 160;


    }



    public int getAtaqueEspecial(int ataqueEspecial){
        return this.ataqueEspecial = atacar() + atacar() + ataqueEspecial;
    }



    @Override
    public int atacar() {
        return super.atacar();

    }




    @Override
    public int caminhar() {
        return 0;
    }



    public void addInventario(String item){
        this.inventario.add(item);

    }
    public List<String> getInventario(){
        return this.inventario;
    }
    public  void removeInventario(String item){
        this.inventario.remove(item);
    }
    public boolean  itemExitente(String item){
       return this.inventario.contains(item);

    }


}
        



