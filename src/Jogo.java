import java.util.ArrayList;

public class Jogo {
    protected ArrayList<Personagem> personagens;
    public Jogo() {
        personagens = new ArrayList<>();
    }

    public void registrarPersonagem(Personagem p) {
        personagens.add(p);
        System.out.println(p.getNome() + " foi registrado no jogo!");
    }

    public void IniciarBatalha(){

    }

    public void listarPersonagens() {
        System.out.println("Personagens disponíveis:");
        for (Personagem p : personagens) {
            System.out.println("- " + p.getNome() + " (Nível: " + p.getNivel() + ")");
        }
    }

    public void exibirHistorico(){

    }

}
