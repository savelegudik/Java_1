package gravitrips;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldTest {

    @Test
    void checkWinByColumn() {
        Piece[][] arr = {
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.Y},
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.Y},
                {Piece.X, Piece.X, Piece.Y, Piece.X, Piece.X, Piece.Y},
                {Piece.Y, Piece.Y, Piece.X, Piece.Y, Piece.Y, Piece.Y},
                {Piece.X, Piece.Y, Piece.Y, Piece.X, Piece.X, Piece.X},
                {Piece.X, Piece.Y, Piece.X, Piece.X, Piece.Y, Piece.Y}};

        Field field = new Field(arr);

        assertEquals(Piece.Y, field.checkWinByColumn(arr));
    }

    @Test
    void checkWinByRow() {
        Piece[][] arr = {
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.X},
                {Piece.X, Piece.X, Piece.Y, Piece.X, Piece.X, Piece.X},
                {Piece.X, Piece.Y, Piece.Y, Piece.X, Piece.X, Piece.X},
                {Piece.Y, Piece.X, Piece.X, Piece.Y, Piece.Y, Piece.Y},
                {Piece.X, Piece.Y, Piece.Y, Piece.X, Piece.X, Piece.X},
                {Piece.X, Piece.Y, Piece.Y, Piece.Y, Piece.Y, Piece.X}};

        Field field = new Field(arr);

        assertEquals(Piece.Y, field.checkWinByRow(arr));
    }

    @Test
    void checkWinByDiagonal() {
        Piece[][] arr = {
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.X},
                {Piece.X, Piece.X, Piece.X, Piece.X, Piece.X, Piece.X},
                {Piece.X, Piece.Y, Piece.Y, Piece.Y, Piece.X, Piece.X},
                {Piece.Y, Piece.X, Piece.X, Piece.Y, Piece.Y, Piece.Y},
                {Piece.X, Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X},
                {Piece.X, Piece.X, Piece.Y, Piece.Y, Piece.Y, Piece.Y}};

        Field field = new Field(arr);

        assertEquals(Piece.Y, field.checkWinByDiagonal(arr));
    }

    @Test
    void checkWinByDiagonalY() {
        Piece[][] arr = {
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.X},
                {Piece.X, Piece.X, Piece.X, Piece.X, Piece.Y, Piece.X},
                {Piece.X, Piece.Y, Piece.X, Piece.Y, Piece.X, Piece.X},
                {Piece.Y, Piece.O, Piece.Y, Piece.Y, Piece.Y, Piece.Y},
                {Piece.Y, Piece.Y, Piece.Y, Piece.X, Piece.Y, Piece.X},
                {Piece.X, Piece.X, Piece.Y, Piece.Y, Piece.Y, Piece.Y}};

        Field field = new Field(arr);

        assertEquals(Piece.Y, field.checkWinByDiagonal(arr));
    }
}
