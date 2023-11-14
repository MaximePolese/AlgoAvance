import java.util.Scanner;

public class Joueur {
    private int score;
    private String name;
    private int numero;
    private Scanner clavier;

    public Joueur(String name, int numero) {
        this.name = name;
        this.numero = numero;
        clavier = new Scanner(System.in);
        this.score = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int chooseCaseX() {
        System.out.print("choix x joueur " + numero + " :");
        int xChoice = clavier.nextInt();
        return xChoice;
    }

    public int chooseCaseY() {
        System.out.print("choix y joueur " + numero + " :");
        int xChoice = clavier.nextInt();
        return xChoice;
    }

    public void setTo0Score() {
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
