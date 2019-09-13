package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    public static ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard = null;
    }

    @Test
    public void input01(){
        chessBoard.setRow(3);



        chessBoard.setCol(3);
        int x = chessBoard.getRow();



        int y = chessBoard.getCol();
        String[][] z = {
                {"W","W","|"},
                {"B","B","|"},
                {"W","W","|"}
        };
        assertEquals(z,chessBoard.makeboard());
    }
}
}