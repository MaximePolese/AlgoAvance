public class Pion extends Case {

    private Joueur joueur;

    public Pion(Joueur joueur, int posX, int posY) {
        super(posX, posY);
        this.joueur = joueur;
    }

    @Override
    public void displayCase() {
        if (joueur.getId() == 1) {
            System.out.print("|  X  |");
        } else {
            System.out.print("|  O  |");
        }
    }
}
