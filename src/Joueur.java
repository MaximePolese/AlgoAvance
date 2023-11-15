import java.util.Scanner;

public class Joueur {
    private int score;
    private String name;
    private int numero;

    protected String representation = " ";

    private Scanner clavier = new Scanner(System.in);


    public Joueur(String name, int numero) {
        this.name = name;
        this.numero = numero;
        this.score = 0;
        this.representation = "| X |";
    }

    public int[] getMove(){
        int[] move = new int[2];
        move[0] = chooseCaseX();
        move[1] = chooseCaseY();
        return move;
    }

    private int chooseCaseX() {
        int xChoice = -1;
        while(xChoice < 0 || xChoice > 3) {
            System.out.print("choix x joueur " + this.numero + " :");
            xChoice = clavier.nextInt();
        }
        return xChoice;
    }


    private int chooseCaseY() {
        int yChoice = -1;
        while(!(yChoice > -1 && yChoice < 3)) {
            System.out.print("choix y joueur " + this.numero + " :");
            yChoice = clavier.nextInt();
        }
        return yChoice;
    }


    @Override
    public String toString() {
        return representation;
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
