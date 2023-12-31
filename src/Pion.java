public class Pion extends Case {

    private Joueur owner;

    public Pion(Joueur joueur, int posX, int posY) {
        super(posX, posY);
        this.owner = joueur;
    }

    @Override
    public void displayCase4() {
        if (owner.getNumero() == 1) {
            System.out.print(ANSI_RED + "| X |" + ANSI_RESET);
        } else if (owner.getNumero() == 2) {
            System.out.print(ANSI_GREEN + "| O |" + ANSI_RESET);
        }
    }

    @Override
    public void displayCase() {
        if (owner.getNumero() == 1) {
            System.out.print(ANSI_RED + "|  X  |" + ANSI_RESET);
        } else if (owner.getNumero() == 2) {
            System.out.print(ANSI_GREEN + "|  O  |" + ANSI_RESET);
        }
    }

    public Joueur getOwner() {
        return owner;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
