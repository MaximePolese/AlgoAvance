public class Plateau {
    private Case[][] board;

    public Plateau(int nbCaseHauteur, int nbcaseLargeur) {
        initBoard(nbCaseHauteur, nbcaseLargeur);
    }

    private void initBoard(int nbCaseHauteur, int nbcaseLargeur) {
        board = new Case[nbCaseHauteur][nbcaseLargeur];
        for (int i = 0; i < board.length; i = i + 1) {
            for (int j = 0; j < board[i].length; j = j + 1) {
                board[i][j] = new Case(i, j);
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < board.length; i = i + 1) {
            for (int j = 0; j < board[i].length; j = j + 1) {
                board[i][j].displayCase();
            }
            System.out.println();
        }
    }

    public void addPion(Joueur joueur, int posX, int posY) {
       board[posX][posY] = new Pion(joueur, posX, posY);
    }

//    public boolean checkCase(int position) {
//        System.out.println("WIP");
//        return true;
//    }
}
