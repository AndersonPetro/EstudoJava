package aulaArraysList;

import javax.swing.*;
import java.util.ArrayList;

public class AulaArraysList {
    ArrayList<Carro> cadastro = new ArrayList<Carro>();

    public static void main(String[] args) {
        AulaArraysList obj = new AulaArraysList();
        obj.cadastro.add(new Carro("fusca","ford",1980));
        obj.cadastro.add(new Carro("carro","marca",2000));

        for(int i=0;i<obj.cadastro.size();i++){
           // JOptionPane.showConfirmDialog(null,obj.cadastro.get(i).nome);
           // JOptionPane.showConfirmDialog(null,obj.cadastro.get(i).marca);

        }

    }
}
