public class Batalha {
    protected Personagem jogador1;
    protected Personagem jogador2;

    public Batalha(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciar() {
        System.out.println("A batalha entre " + jogador1.getNome() + " e " + jogador2.getNome() + " começou!");

        while (jogador1.estaVivo() && jogador2.estaVivo()) {
            registrarTurno(jogador1, jogador2);
            if (!jogador2.estaVivo()) break;
            registrarTurno(jogador2, jogador1);
        }

        verificarVencedor();
    }

    private void registrarTurno(Personagem atacante, Personagem defensor) {
        // Implementar a lógica do turno (atacar, defender, usar habilidade)
        atacante.atacar(defensor);
    }

    private void verificarVencedor() {
        if (jogador1.estaVivo()) {
            System.out.println(jogador1.getNome() + " venceu a batalha!");
            atualizarExperiencia(jogador1);
        } else {
            System.out.println(jogador2.getNome() + " venceu a batalha!");
            atualizarExperiencia(jogador2);
        }
    }

    private void atualizarExperiencia(Personagem vencedor) {
        vencedor.subirNivel();
    }
}
