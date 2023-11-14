import java.util.Scanner;

public class Puissance4 implements Game{
    private Plateau board;
    private Joueur p1;
    private Joueur p2;
    private GameState result;
    private Scanner clavier;

    public Puissance4() {
        board = new Plateau(6, 7);
        p1 = new Joueur("Tata", 1);
        p2 = new Joueur("Maximilien", 2);
        clavier = new Scanner(System.in);
        result = GameState.RUN;
    }

    public int chooseColonne(Joueur joueur) {
        int yChoice = -1;
        while (!(yChoice > -1 && yChoice < board.getBoard().length)) {
            System.out.print("Joueur " + joueur.getNumero() + " choisir une colonne entre 0 et 6 : ");
            yChoice = clavier.nextInt();
        }
        return yChoice;
    }

    @Override
    public boolean isOver(Joueur joueur) {
        if (board.colonne(joueur, 4) || board.ligne(joueur, 4) || board.diagonale1(joueur, 4) || board.diagonale2(joueur, 4)) {
            System.out.println(joueur.getName() + " WIN !!!!!!!");
            result = GameState.ISOVER;
            return true;
        } else {
            return false;
        }
    }

    private void tourJoueur(Joueur joueur) {
        if (result != GameState.ISOVER) {
            int y = chooseColonne(joueur);
            if (!board.checkCase(0, y)) {
                board.addPionPuissance4(joueur, y);
                board.displayBoard();
                isOver(joueur);
            } else {
                System.out.println("c'est occupé");
            }
        }
    }

    public void playGame() {
        board.displayBoard();
        while (result != GameState.ISOVER) {
            tourJoueur(p1);
            tourJoueur(p2);
        }
        System.out.println("ok");
    }
}
