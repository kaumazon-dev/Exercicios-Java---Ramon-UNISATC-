import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String nome;
    List<Musica> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionar(Musica musica) {
        musicas.add(musica);
    }
}
