import java.util.Scanner;

public class Joueur {
    private String name;
    private int numero;
    private Scanner clavier = new Scanner(System.in);
    public Joueur(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int chooseCaseX(){
        System.out.println("choix x joueur : "+numero);
        int xChoice = clavier.nextInt();
        return xChoice;
    }

    public int chooseCaseY(){
        System.out.println("choix y joueur : "+numero);
        int xChoice = clavier.nextInt();
        return xChoice;
    }
}
