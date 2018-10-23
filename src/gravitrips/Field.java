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

    public void showField(Piece[][] arr, Field field) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(field.field[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Piece[][] move(int a, Piece piece) {
        int i = 5;
        while (i >= 0) {
            if (field[i][a - 1] == Piece.O) {
                field[i][a - 1] = piece;
                break;
            }
            i--;
        }
        return field;
    }

    public boolean checkColumnForFullness(int a, Piece[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (field[0][a - 1] == Piece.X || field[0][a - 1] == Piece.Y) {
                    return true;
                }
            }
        }
        return false;
    }

    public Piece checkWinByColumn(Piece[][] arr) {
        boolean victoryX = false;
        boolean victoryY = false;
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == field[i + 2][j]) && (field[i][j] == field[i + 3][j]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }

        Piece winPiece = Piece.O;
        if (victoryX) {
            winPiece = Piece.X;
        } else if (victoryY) {
            winPiece = Piece.Y;
        }
        return winPiece;
    }

    public Piece checkWinByRow(Piece[][] arr) {
        boolean victoryX = false;
        boolean victoryY = false;
        int score = 1;
        for (int i = 0; i < arr.length; i++) {
            score = 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == Piece.X)) {
                    score++;
                }
            }
        }
        if (score > 3) {
            victoryX = true;
        }
        score = 1;
        for (int i = 0; i < arr.length; i++) {
            score = 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == Piece.Y)) {
                    score++;
                }
            }
        }
        if (score > 3) {
            victoryY = true;
        }
        Piece winPiece = Piece.O;
        if (victoryX) {
            winPiece = Piece.X;
        } else if (victoryY) {
            winPiece = Piece.Y;
        }
        return winPiece;
    }

    public Piece checkWinByDiagonal(Piece[][] arr) {
        boolean victoryX = false;
        boolean victoryY = false;
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 3; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.X)) {
                    victoryX = true;
                }
            }
        }
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] == field[i + 2][j + 2]) && (field[i][j] == field[i + 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }
        for (int i = 3; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 3; j++) {
                if ((field[i][j] == field[i - 1][j + 1]) && (field[i][j] == field[i - 2][j + 2]) && (field[i][j] == field[i - 3][j + 3]) && (field[i][j] == Piece.Y)) {
                    victoryY = true;
                }
            }
        }
        Piece winPiece = Piece.O;
        if (victoryX) {
            winPiece = Piece.X;
        } else if (victoryY) {
            winPiece = Piece.Y;
        }
        return winPiece;
    }
}
