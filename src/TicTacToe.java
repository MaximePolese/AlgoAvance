import java.util.Scanner;

public class TicTacToe implements Game {
    private Plateau board;
    private Joueur p1;
    private Joueur p2;
    private GameState result;
    private Scanner clavier;

    public TicTacToe() {
        board = new Plateau(3, 3);
        p1 = new Joueur("Edouard", 1);
        p2 = new Joueur("Maximilien", 2);
        clavier = new Scanner(System.in);
        result = GameState.RUN;
    }

    public int chooseCaseX(Joueur joueur) {
        int xChoice = -1;
        while(xChoice < 0 || xChoice > board.getBoard().length) {
            System.out.print("choix x joueur " + joueur.getNumero() + " :");
            xChoice = clavier.nextInt();
        }
        return xChoice;
    }

    public int chooseCaseY(Joueur joueur) {
        int yChoice = -1;
        while(!(yChoice > -1 && yChoice < board.getBoard().length)) {
            System.out.print("choix y joueur " + joueur.getNumero() + " :");
            yChoice = clavier.nextInt();
        }
        return yChoice;
    }

    @Override
    public boolean isOver(Joueur joueur) {
        if (board.colonne(joueur, board.getBoard().length) || board.ligne(joueur, board.getBoard().length) || board.diagonale1(joueur, board.getBoard().length) || board.diagonale2(joueur, board.getBoard().length)) {
            System.out.println(joueur.getName() + " WIN !!!!!!!");
            result = GameState.ISOVER;
            return true;
        } else {
            return false;
        }
    }

    private void tourJoueur(Joueur joueur) {
        if (result != GameState.ISOVER ) {
            int x = chooseCaseX(joueur);
            int y = chooseCaseY(joueur);
            if (!board.checkCase(x, y)) {
                board.addPion(joueur, x, y);
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
    }
}
