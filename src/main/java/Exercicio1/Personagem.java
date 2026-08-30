package Exercicio1;

public class Personagem {
    private String nome;
    private Integer vida;
    private Integer ataque;

    public Personagem(String nome, Integer vida, Integer ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public void receberDano(int dano){
        vida -= dano;
        if (vida <= 0) System.out.println(nome+" derrotado");else System.out.println(nome+" viveu");
    }

    public void atacar(Personagem alvo){
        alvo.receberDano(alvo.ataque);
        if (alvo.vida == 0){
            System.out.println("Ataque falhou");
        }
    }
}
