public class Case {
    private int posX;
    private int posY;

    private Joueur owner;

    public Case(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.owner = null;
    }

    public void displayCase() {
        System.out.print("| " + posX + ":" + posY + " |");
    }
    public void displayCase4() {
        System.out.print("| " + posY + " |");
    }

    @Override
    public String toString() {
        return "Case{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
