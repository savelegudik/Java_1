package gravitrips.tests;

import gravitrips.Field;
import gravitrips.Piece;
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

        assertEquals(Piece.Y, field.checkWinByColumn());
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

        assertEquals(Piece.Y, field.checkWinByRow());
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

        assertEquals(Piece.Y, field.checkWinByDiagonal());
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

        assertEquals(Piece.Y, field.checkWinByDiagonal());
    }
}
