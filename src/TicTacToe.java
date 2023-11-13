import java.util.ArrayList;

public class TicTacToe implements Game {
    private Plateau board;

    private Joueur p1;

    private Joueur p2;



    public TicTacToe () {
        board = new Plateau(3,3);
        p1 = new Joueur("Edouard", 1);
        p2 = new Joueur("Maximilien", 2);
    }

    @Override
    public boolean isOver() {
        if (board.colonne() || board.ligne() || board.diagonale1() || board.diagonale2()){
            return true;
        } else {
            return false;
        }
    }

    public void startGame(){
        board.displayBoard();
        while (!isOver()){
            int x = p1.chooseCaseX();
            int y = p1.chooseCaseY();
            if (!board.checkCase(x, y)){
                board.addPion(p1, x, y);
                board.displayBoard();
            } else {
                System.out.println("c'est occupé");
            }


            x = p2.chooseCaseX();
            y = p2.chooseCaseY();
            if (!board.checkCase(x, y)){
            board.addPion(p2, x, y);
            board.displayBoard();
            } else {
                System.out.println("c'est occupé");
            }
        }
    }



//    @Override
//    public ArrayList<Integer> getPossibleMoves(ArrayList<Integer> possibleMoves) {
//        return possibleMoves.remove();
//    }




}
