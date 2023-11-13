import java.util.ArrayList;

public class TicTacToe implements Game {


    public TicTacToe () {

    }

    @Override
    public boolean nextTurn() {
        return false;
    }

    @Override
    public boolean isOver() {
        /* si on a 3 formes similaires, ou 3 positions d'un même joueur qui sont sur une diagonales ou sur un
        côté ou sur une ligne, alors la partie est Over*/
        return false;
    }




//    @Override
//    public ArrayList<Integer> getPossibleMoves(ArrayList<Integer> possibleMoves) {
//        return possibleMoves.remove();
//    }




}
