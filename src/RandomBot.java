public class RandomBot extends Bot {


    public RandomBot(String name, int numero) {
        super(name, numero);
    }

    @Override
    public int[] getMove() {
        int x = this.randChoice(3,0);
        System.out.println("choix x joueur " + this.getNumero() + " :" + x);
        int y = this.randChoice(3,0);
        System.out.println("choix y joueur " + this.getNumero() + " :" + y);
        return new int[]{x, y};
    }
}
