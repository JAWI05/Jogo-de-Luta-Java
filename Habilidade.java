public class Habilidade {
    protected String nome;
    public enum Tipo {
        Cura, Envenenar, Aumento_ataque
    }
    public Tipo tipo;
    protected double poder;
    protected double custoEnergia;

    public Habilidade(String nome, Tipo tipo, double poder, int custoEnergia) {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        this.custoEnergia = custoEnergia;
    }

    public void AtivarHabilidade(Personagem personagem, Personagem oponente) {
        if (tipo == Tipo.Cura) {
            personagem.setVida(personagem.getVida()+poder);
            personagem.setDefesa(personagem.getDefesa()+(personagem.getDefesa()*0.05));
            custoEnergia -= (custoEnergia*0.9);
        }
        if (tipo == Tipo.Envenenar) {
            oponente.setVida(oponente.getVida() - poder);
            oponente.setAgilidade(oponente.getAgilidade() - poder);
            custoEnergia -= (custoEnergia*0.9);
        }
        if(tipo == Tipo.Aumento_ataque){
            personagem.setForca(personagem.getForca()+poder);
            personagem.setVida(personagem.getVida()-(personagem.getVida()*0.1));
            personagem.setForca(personagem.getForca() - (personagem.getForca()*0.1));
            custoEnergia -= (custoEnergia*0.9);
        }
    }
}