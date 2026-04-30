import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private double vida;
    private int nivel;
    private double forca;
    private double defesa;
    private double agilidade;
    private Arma arma;
    private List<Habilidade> habilidades;
    private int experiencia;

    public Personagem(String nome, double vida, int nivel, double forca, double defesa, double agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.habilidades = new ArrayList<>();
        this.experiencia = 0;
    }

    public void atacar(Personagem oponente) {
        double danoBase = arma.calcularDano(this);
        double danoRecebido = danoBase - oponente.defesa;
        danoRecebido = Math.max(danoRecebido, 0);

        oponente.receberDano(danoRecebido);
        System.out.println(nome + " atacou " + oponente.getNome() + " causando " + danoRecebido + " de dano.");
    }

    public void receberDano(double dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    public void defender(int dano) {
        double danoReduzido = dano - defesa;
        vida -= Math.max(danoReduzido, 0);
    }

    public void usarHabilidade(Personagem personagem, Habilidade habilidade) {
        habilidade.AtivarHabilidade(this, personagem);
    }

    public void subirNivel() {
        nivel++;
        forca += 2;
        vida += 10;
        defesa += 1;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
