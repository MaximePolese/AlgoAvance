import java.util.ArrayList;

public class TicTacToe implements Game {
    private Plateau board;

    private Joueur p1;

    private Joueur p2;



    public TicTacToe () {
        board = new Plateau(3,3);
        p1 = new Joueur("Edouard");
        p2 = new Joueur("Maximilien");
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

    public Joueur getP1() {
        return p1;
    }




//    @Override
//    public ArrayList<Integer> getPossibleMoves(ArrayList<Integer> possibleMoves) {
//        return possibleMoves.remove();
//    }




}
