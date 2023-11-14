public class Plateau {
    private Case[][] board;

    public Plateau(int nbCaseHauteur, int nbcaseLargeur) {
        initBoard(nbCaseHauteur, nbcaseLargeur);
    }

    private void initBoard(int nbCaseHauteur, int nbcaseLargeur) {
        board = new Case[nbCaseHauteur][nbcaseLargeur];
        for (int i = 0; i < board.length; i = i + 1) {
            for (int j = 0; j < board[i].length; j = j + 1) {
                board[i][j] = new Case(i, j);
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < board.length; i = i + 1) {
            for (int j = 0; j < board[i].length; j = j + 1) {
                board[i][j].displayCase();
            }
            System.out.println();
        }
    }

    public void addPion(Joueur joueur, int positionX, int positionY) {
        board[positionX][positionY] = new Pion(joueur, positionX, positionY);
    }

    public boolean checkCase(int positionX, int positionY) {
        return board[positionX][positionY] instanceof Pion;
    }

    public boolean diagonale1(Joueur joueur) {
        joueur.setScoreTo0();
        for (int i = 0; i < board.length; i = i + 1) {
            if (board[i][i] instanceof Pion && ((Pion) board[i][i]).getJoueur() == joueur) {
                joueur.incrementScore();
            }
        }
        return joueur.getScore() == board.length;
    }

    public boolean diagonale2(Joueur joueur) {
        joueur.setScoreTo0();
        for (int i = 0; i < board.length; i = i + 1) {
            if (board[board.length - i - 1][i] instanceof Pion && ((Pion) board[board.length - i - 1][i]).getJoueur() == joueur) {
                joueur.incrementScore();
            }
        }
        return joueur.getScore() == board.length;
    }

    public boolean colonne(Joueur joueur) {
        boolean rs = false;
        for (int i = 0; i < board.length; i = i + 1) {
            joueur.setScoreTo0();
            for (int j = 0; j < board[i].length; j = j + 1) {
                if (board[i][j] instanceof Pion && ((Pion) board[i][j]).getJoueur() == joueur) {
                    joueur.incrementScore();
                }
            }
            if (joueur.getScore() == board.length) {
                rs = true;
            }
        }
        return rs;
    }

    public boolean ligne(Joueur joueur) {
        boolean rs = false;
        for (int i = 0; i < board.length; i = i + 1) {
            joueur.setScoreTo0();
            for (int j = 0; j < board[i].length; j = j + 1) {
                if (board[j][i] instanceof Pion && ((Pion) board[j][i]).getJoueur() == joueur) {
                    joueur.incrementScore();
                }
            }
            if (joueur.getScore() == board.length) {
                rs = true;
            }
        }
        return rs;
    }

    public Case[][] getBoard() {
        return board;
    }
}
