public class Arma {
    public enum Tipo {
        Espada, Arco, Lança
    }
    public Tipo tipo;
    protected int danoBase;
    protected String nome;

    public Arma(Tipo tipo, int danoBase, String nome) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.tipo = tipo;
    }

    public int calcularDano(Personagem personagem) {
        int danoTotal = danoBase;

        if (tipo == Tipo.Espada) {
            int forcaModificada = (int) (personagem.getForca() + personagem.getForca() * 0.1);
            danoTotal += forcaModificada;
        } else if (tipo == Tipo.Arco) {
            int agilidadeModificada = (int) (personagem.getAgilidade() + personagem.getAgilidade() * 0.2);
            danoTotal += agilidadeModificada;
        }

        return danoTotal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public String getNome() {
        return nome;
    }
}
