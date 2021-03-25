package testeDoGuerreiro;

public abstract  class Personagem {
    //Atritubos
    private String nome;
    private int vida;
    private int level;
    private float dinheiro;
    private int atack;
    private int defesa;

    public Personagem() {

    }

    //Construcao
    public Personagem(String nome, int level, float dinheiro, int atack, int defesa) {
        this.nome = nome;
        this.vida = 100;
        this.level = level;
        this.dinheiro = dinheiro;
        this.atack = atack;
        this.defesa = defesa;
    }

    //comportamentos
    public int atacar() {
        return this.atack;
    }

    public int defender(int ataque) {
        var hit = ataque - this.defesa;
        if (hit > 0) {
            this.removeVida(hit);

        }
        return this.vida;
    }

    public int removeVida(int ataque) {
        this.vida = this.vida - ataque;
        return this.vida;
    }

    public int caminhar() {
        return 0;


    }

    //geters e seters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    void atacar(int vida) {
        atack -= vida;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", level=" + level +
                ", dinheiro=" + dinheiro +
                ", atack=" + atack +
                '}';
    }
}

















