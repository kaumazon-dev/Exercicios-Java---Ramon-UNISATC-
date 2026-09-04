import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.println("Digite o nome da playlist:");
        Playlist playlist = new Playlist(scanner.nextLine());

        while (true) {
            System.out.println("Digite o nome da musica (ou 'sair' para parar):");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Musica musica = musicCloud.pesquisar(titulo);
                playlist.adicionar(musica);
                System.out.println("Voce adicionou a musica " + musica.titulo + " na playlist.");
            } catch (MusicaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Playlist:");
        for (Musica musica : playlist.musicas) {
            System.out.println("- " + musica.artista);
        }
    }
}
