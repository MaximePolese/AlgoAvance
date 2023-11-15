import java.util.Scanner;

public class TicTacToe {
    private Plateau board;
    private Joueur p1;
    private Joueur p2;

    private Joueur currentJoueur;
    private GameState result;

    public TicTacToe() {
        board = new Plateau(3, 3);
        p1 = new Joueur("Edouard", 1);
        p2 = new RandomBot("Skynet", 2);
        this.currentJoueur = p1;
        result = GameState.RUN;
    }

    public Joueur nextPlayer() {
        if (this.currentJoueur.getNumero() == 1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }

    void testBot() {
        board.addPion(p2, 0, 0);
        board.addPion(p2, 0, 1);
        board.addPion(p2, 0, 2);
        board.addPion(p2, 1, 0);
        board.addPion(p2, 1, 1);
        board.addPion(p2, 1, 2);
        board.addPion(p2, 2, 0);
        board.addPion(p2, 2, 1);
        board.addPion(p2, 2, 2);
    }


    public boolean isOver(Joueur joueur, int posY) {
        if (board.colonne(joueur, board.getBoard().length) || board.ligne(joueur, board.getBoard().length) || board.diagonale1(joueur, board.getBoard().length) || board.diagonale2(joueur, board.getBoard().length)) {
            System.out.println(joueur.getName() + " WIN !!!!!!!");
            result = GameState.ISOVER;
            return true;
        } else {
            return false;
        }
    }

    private void tourJoueur(Joueur joueur) {
        if (result != GameState.ISOVER) {
            result = GameState.UNVALID_ANSWER;
        }
        while (!(result == GameState.VALID_ANSWER || result == GameState.ISOVER)) {
            int[] coords = joueur.getMove();
            int x = coords[0];
            int y = coords[1];
            if (!board.checkCase(x, y)) {
                board.addPion(joueur, x, y);
                board.displayBoard();
                result = GameState.VALID_ANSWER;
                isOver(joueur, y);
            } else {
                System.out.println("c'est occupé");
            }
        }
    }

    public void playGame() {

//        //test a supprimer
//        if (p2 instanceof Bot){
//            ((Bot) p2).getAllEmptyCase(this.getBoard());
//            System.out.println(((Bot) p2).scoreOnBoard(this));
//        }
//        //fin test a suprimer

        board.displayBoard();
        while (result != GameState.ISOVER) {

            tourJoueur(p1);
            tourJoueur(p2);
        }
    }

    public Joueur getP1() {
        return p1;
    }

    public Plateau getBoard() {
        return board;
    }

    public Joueur getP2() {
        return p2;
    }
}
