public class Pion extends Case {

    public Pion(Joueur joueur, int posX, int posY) {
        super(joueur, posX, posY);
    }
    public void displayPion(Joueur joueur){
        if (joueur == Game.p1) {
            System.out.println("| X |");
        }
        else {
            System.out.println("| O |");
        }
    }
}
