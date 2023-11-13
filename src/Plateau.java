public class Plateau {
    private  Case[][] board;
    public Plateau(int nbCaseHauteur, int nbcaseLargeur){
        initBoard(nbCaseHauteur, nbcaseLargeur);
    }

    private void initBoard(int nbCaseHauteur, int nbcaseLargeur){
        board = new Case[nbCaseHauteur][nbcaseLargeur];
        for (int i=0; i<board.length; i=i+1){
            for (int j=0; j<board[i].length; j=j+1){
                board[i][j] = new Case(i, j);
            }
        }
    }
    public void displayBoard(){
        for (int i=0; i<board.length; i=i+1){
            for (int j=0; j<board[i].length; j=j+1){
                board[i][j].displayCase();
            }
            System.out.println();
        }
    }

    public void addPion(Joueur joueur, int positionX, int positionY){
        board[positionX][positionY] = new Pion(joueur, positionX, positionY);
    }

    public boolean checkCase(int positionX, int positionY){
        return board[positionX][positionY] instanceof Pion;
    }
}
