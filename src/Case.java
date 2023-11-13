public class Case {
    private int posX;
    private int posY;
    public Case(Joueur joueur, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public void displayCase(){
        System.out.println("| case |");
    }
}
