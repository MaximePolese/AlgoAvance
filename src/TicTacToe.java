
import java.util.Scanner;

public class TicTacToe {
    private Plateau board;
    private Joueur p1;
    private Joueur p2;
    private Scanner keyboard;
    private GameState result;

    public TicTacToe() {
        board = new Plateau(3, 3);
        board.displayBoard();
        keyboard = new Scanner(System.in);
        result = GameState.tour1;
        System.out.print("Enter player 1 name :");
        String name1 = keyboard.nextLine();
        p1 = new Joueur(name1);
        System.out.print("Enter player 2 name :");
        String name2 = keyboard.nextLine();
        p2 = new Joueur(name2);
    }

    public void playGame() {
        while (result != GameState.gameOver) {
            if (result == GameState.tour1) {
                System.out.print("Enter posX :");
                int posX = keyboard.nextInt();
                System.out.print("Enter posY :");
                int posY = keyboard.nextInt();
                board.addPion(p1, posX, posY);
                board.displayBoard();
                result = GameState.tour2;
            }
            if (result == GameState.tour2) {
                System.out.print("Enter posX :");
                int posX = keyboard.nextInt();
                System.out.print("Enter posY :");
                int posY = keyboard.nextInt();
                board.addPion(p2, posX, posY);
                board.displayBoard();
                result = GameState.tour1;
            }

        }
    }

    public Joueur getP1() {
        return p1;
    }
//    @Override
//    public boolean nextTurn() {
//        return false;
//    }
//
//    @Override
//    public boolean isOver() {
//        /* si on a 3 formes similaires, ou 3 positions d'un même joueur qui sont sur une diagonales ou sur un
//        côté ou sur une ligne, alors la partie est Over*/
//        return false;
//    }

//    @Override
//    public ArrayList<Integer> getPossibleMoves(ArrayList<Integer> possibleMoves) {
//        return possibleMoves.remove();
//    }


}
