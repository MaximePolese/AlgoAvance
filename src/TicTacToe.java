import java.util.ArrayList;

public class TicTacToe implements Game {
    private Plateau board;
    private Joueur p1;
    private Joueur p2;
    private GameState result;

    public TicTacToe() {
        board = new Plateau(3, 3);
        p1 = new Joueur("Edouard", 1);
        p2 = new Joueur("Maximilien", 2);
        result = GameState.tour1;
    }

    @Override
    public boolean isOver(Joueur joueur) {
        if (board.colonne(joueur) || board.ligne(joueur) || board.diagonale1(joueur) || board.diagonale2(joueur)) {
            System.out.println(joueur.getName() + " WIN !!!!!!!");
            result = GameState.isover;
            return true;
        } else {
            return false;
        }
    }

    private void tourJoueur(Joueur joueur) {
        if (result != GameState.isover && result == GameState.tour2) {
            int x = p2.chooseCaseX();
            int y = p2.chooseCaseY();
            if (!board.checkCase(x, y)) {
                board.addPion(p2, x, y);
                board.displayBoard();
                result = GameState.tour1;
                isOver(p2);
            } else {
                System.out.println("c'est occupé");
            }
        }
    }

    public void startGame() {
        board.displayBoard();
        while (result != GameState.isover) {
            if (result != GameState.isover && result == GameState.tour1) {
                int x = p1.chooseCaseX();
                int y = p1.chooseCaseY();
                if (!board.checkCase(x, y)) {
                    board.addPion(p1, x, y);
                    board.displayBoard();
                    result = GameState.tour2;
                    isOver(p1);
                } else {
                    System.out.println("c'est occupé");
                }
            }
            if (result != GameState.isover && result == GameState.tour2) {
                int x = p2.chooseCaseX();
                int y = p2.chooseCaseY();
                if (!board.checkCase(x, y)) {
                    board.addPion(p2, x, y);
                    board.displayBoard();
                    result = GameState.tour1;
                    isOver(p2);
                } else {
                    System.out.println("c'est occupé");
                }
            }
        }
    }
}
