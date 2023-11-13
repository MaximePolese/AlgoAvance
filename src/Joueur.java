import java.util.Scanner;

public class Joueur {
    private int score;
    private String name;
    private int numero;
    private Scanner clavier = new Scanner(System.in);
    public Joueur(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int chooseCaseX(){
        System.out.print("choix x joueur "+numero+" :");
        int xChoice = clavier.nextInt();
        return xChoice;
    }

    public int chooseCaseY(){
        System.out.print("choix y joueur "+numero+" :");
        int xChoice = clavier.nextInt();
        return xChoice;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
