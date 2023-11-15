public class Case {
    private int posX;
    private int posY;

    public Case(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void displayCase() {
        System.out.print("| " + posX + ":" + posY + " |");
    }
    public void displayCase4() {
        System.out.print("| " + posY + " |");
    }
}
