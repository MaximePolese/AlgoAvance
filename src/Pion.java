public class Pion extends Case {

    private Joueur joueur;
    public Pion(Joueur joueur, int posX, int posY) {
        super(posX, posY);
        this.joueur = joueur;
    }


    @Override
    public void displayCase(){
        if (joueur.getNumero() == 1) {

            System.out.print("|  X  |");
        }
        else if (joueur.getNumero() == 2){
            System.out.print("|  O  |");
        }
    }

    public Joueur getJoueur() {
        return joueur;
    }
}
