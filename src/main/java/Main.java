
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Personagem inimigo1 = new Personagem("Orc", 100, 200);
        Personagem inimigo2 = new Personagem("Goblin", 50, 5);
        Personagem inimigo3 = new Personagem("Lobo", 75, 15);
        Personagem inimigo4 = new Personagem("Cavaleiro", 200, 20);
        Personagem inimigo5 = new Personagem("Dragao", 500, 50);
        Personagem jogador = new Personagem("Kau", 100, 20);
        List<Personagem> inimigos = new ArrayList<Personagem>();
        inimigos.add(inimigo1);
        inimigos.add(inimigo2);
        inimigos.add(inimigo3);
        Random random = new Random();
        int indiceRandom = random.nextInt(inimigos.size());

        for (Personagem i : inimigos){
            if (i.getVida() == 0) System.out.print("O jogador não deve atacar inimigos com vida igual a 0");
            else jogador.atacar(inimigos.get(indiceRandom)); break;
        }

        for (Personagem i : inimigos) {
            i.atacar(jogador);
        };
    }

}
