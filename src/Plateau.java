public class Plateau {
    private Case[][] Board;

    public Plateau(int nbCaseHauteur, int nbcaseLargeur) {
        initBoard(nbCaseHauteur, nbcaseLargeur);
    }

    private void initBoard(int nbCaseHauteur, int nbcaseLargeur) {
        Board = new Case[nbCaseHauteur][nbcaseLargeur];
    }

    public void displayBoard() {
        for (int i = 0; i < Board.length; i = i + 1) {
            for (int j = 0; j < Board[i].length; j = j + 1) {
                System.out.print("| case |");
            }
            System.out.println();
        }
    }

    public void addPion(Joueur joueur, int position) {
        System.out.println("WIP");
    }

    public boolean checkCase(int position) {
        System.out.println("WIP");
        return true;
    }
}
