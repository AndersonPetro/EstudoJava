package Teste3;

public class  ControleRemoto implements Controlador {

        //Atributos
    private int  volume;
    private  boolean ligado;
    private boolean tocando;

    // Metodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;
    }


    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //sobreescrevendo Metodo
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("------Menu------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }


    }

    @Override
    public void fecharMenu() {
        System.out.println("\nfechando Menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 112);
        }else {
            System.out.println("Impossivel aumentar volume");
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }

    }

    @Override
    public void deligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);

        }else{
            System.out.println("Nao consegui reproduzir");
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Nao consegui pausar");
        }

    }
}
