package gravitrips;

public class Field {
    private Piece[][] field;

    public Field() {
        this.field = new Piece[6][6];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = Piece.O;
            }
        }
    }

    public boolean checkColumnForFullness(int step) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[0][step - 1] == Piece.X || field[0][step - 1] == Piece.Y) {
                    return true;
                }
            }
        }
        return false;
    }

    public void changeField(int step, Piece piece) {
        int i = 5;
        while (i >= 0) {
            if (field[i][step - 1] == Piece.O) {
                field[i][step - 1] = piece;
                break;
            }
            i--;
        }
    }

    public void showField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Piece checkWinByColumn() {
        Piece victory = Piece.O;
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.X)) {
                    victory = Piece.X;
                }
            }
        }
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.Y)) {
                    victory = Piece.Y;
                }
            }
        }
        return victory;
    }

    public Piece checkWinByRow() {
        Piece victory = Piece.O;
        int score = 1;
        for (int i = 0; i < field.length; i++) {
            score = 1;
            for (int j = 0; j < field.length - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == Piece.X)) {
                    score++;
                }
            }
        }
        if (score > 3) {
            victory = Piece.X;
        }
        score = 1;
        for (int i = 0; i < field.length; i++) {
            score = 1;
            for (int j = 0; j < field.length - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == Piece.Y)) {
                    score++;
                }
            }
        }
        if (score > 3) {
            victory = Piece.Y;
        }
        return victory;
    }

    public Piece checkWinByDiagonal() {
        Piece victory = Piece.O;
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victory = Piece.X;
                }
            }
        }
        for (int i = 3; i < field.length; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victory = Piece.X;
                }
            }
        }
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victory = Piece.Y;
                }
            }
        }
        for (int i = 3; i < field.length; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victory = Piece.Y;
                }
            }
        }
        return victory;
    }
}
