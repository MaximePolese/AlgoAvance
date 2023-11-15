import java.util.ArrayList;

public class Bot extends Joueur{

    public Bot(String name, int numero) {
        super(name, numero);
        this.representation = "| O |";
    }

    public int randChoice(int upper, int lower){
        return (int) (Math.random() * (upper - lower)) + lower;
    }
    public int scoreOnBoard(TicTacToe game){
        int score = 0;
        if (game.isOver(game.getP1(), 0)){
            score = score + 1;
        } else if (game.isOver(game.getP2(), 0)){
            score = score -1;
        }
        return score;
    }

    public ArrayList<Case> getAllEmptyCase(Plateau board){
        ArrayList<Case> listCase = new ArrayList<>();
        for (int i = 0; i < board.getBoard().length; i = i + 1) {
            for (int j = 0; j < board.getBoard()[0].length; j = j + 1) {
                if (!(board.getBoard()[i][j] instanceof Pion)) {
                    listCase.add(board.getBoard()[i][j]);
                }
            }
        }
        System.out.println(listCase);
        return listCase;
    }

    public Plateau[] getListOf(Plateau board, Joueur joueur){
        Plateau[] theBiggestArryay;
        theBiggestArryay = null;
        return theBiggestArryay;
    }


}
