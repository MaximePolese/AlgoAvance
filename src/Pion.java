public class Pion extends Case {

    public Pion(Joueur joueur, int posX, int posY) {
        super(joueur, posX, posY);
    }
    public void displayPion(Joueur joueur, TicTacToe TicTacToe){
        if (joueur == TicTacToe.getP1()) {
            System.out.println("| X |");
        }
        else {
            System.out.println("| O |");
        }
    }
}
