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

        return false;
    }

    public void startGame(){
        board.displayBoard();
        while (!isOver()){
            board.addPion(p1, p1.chooseCaseX(), p1.chooseCaseY());
            board.displayBoard();

            board.addPion(p2, p2.chooseCaseX(), p2.chooseCaseY());
            board.displayBoard();
        }
    }



//    @Override
//    public ArrayList<Integer> getPossibleMoves(ArrayList<Integer> possibleMoves) {
//        return possibleMoves.remove();
//    }




}
