package gravitrips;

public class Field {
    private Piece[][] field;

    public Field(Piece[][] arr) {
        this.field = new Piece[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                field[i][j] = arr[i][j];
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
        boolean victoryX = false;
        boolean victoryY = false;
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }
        return checkWinPiece(victoryX, victoryY);
    }

    public Piece checkWinByRow() {
        boolean victoryX = false;
        boolean victoryY = false;
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
            victoryX = true;
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
            victoryY = true;
        }
        return checkWinPiece(victoryX, victoryY);
    }

    public Piece checkWinByDiagonal() {
        boolean victoryX = false;
        boolean victoryY = false;
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 3; i < field.length; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 0; i < field.length - 3; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }
        for (int i = 3; i < field.length; i++) {
            for (int j = 0; j < field.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }
        return checkWinPiece(victoryX, victoryY);
    }

    private Piece checkWinPiece(boolean victoryX, boolean victoryY) {
        Piece winPiece = Piece.O;
        if (victoryX) {
            winPiece = Piece.X;
        } else if (victoryY) {
            winPiece = Piece.Y;
        }
        return winPiece;
    }
}
