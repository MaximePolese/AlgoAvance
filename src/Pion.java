public class Pion extends Case {

    private Joueur joueur;

    public Pion(Joueur joueur, int posX, int posY) {
        super(posX, posY);
        this.joueur = joueur;
    }

    @Override
    public void displayCase() {
        if (joueur == 1) {
            System.out.println("| X |");
        } else {
            System.out.println("| O |");
        }
    }
}
