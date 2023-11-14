public class Joueur {
    private int score;
    private String name;
    private int numero;

    public Joueur(String name, int numero) {
        this.name = name;
        this.numero = numero;
        this.score = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setScoreTo0() {
        this.score = 0;
    }

    public void incrementScore() {
        this.score = this.score + 1;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
