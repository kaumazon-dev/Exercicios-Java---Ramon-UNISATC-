import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    List<Musica> musicasDisponiveis = new ArrayList<>();

    public MusicCloud() {
        musicasDisponiveis.add(new Musica("Macarena", "Los del Rio"));
        musicasDisponiveis.add(new Musica("Evidencias", "Chitaozinho & Xororo"));
        musicasDisponiveis.add(new Musica("Despacito", "Luis Fonsi"));
    }

    // Recebe o titulo procurado. Devolve a Musica encontrada
    // ou lanca a excecao se nao existir na lista.
    public Musica pesquisar(String titulo) throws MusicaNaoEncontradaException {
        for (Musica musica : musicasDisponiveis) {
            if (musica.titulo.equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        throw new MusicaNaoEncontradaException(
            "A musica " + titulo + " nao foi encontrada no sistema.");
    }
}
