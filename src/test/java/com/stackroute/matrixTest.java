package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class matrixTest {

    private static matrix matrix;
}



    @Before
    public void setUp() throws Exception {

        matrix = new matrix();
    }

    @After
    public void tearDown() throws Exception {
        matrix = null;
    }

        @Test
        public void input1(){


            matrix.setRow(3);
            matrix.setCol(2);
            int[][] matrix1 =new int[matrix.getRow()][matrix.getCol()];
            matrix1[0][0] = 2;
            matrix1[0][1] = 5;
            matrix1[0][2] = 5;
            matrix1[1][0] = 4;
            matrix1[1][1] = 3;
            matrix1[1][2] = 7;

            int[][] matrix2 =new int[matrix.getRow()][matrix.getCol()];
            matrix2[0][0] = 9;
            matrix2[0][1] = 6;
            matrix2[0][2] = 7;
            matrix2[1][0] = 8;
            matrix2[1][1] = 5;
            matrix2[1][2] = 4;


            int[][] sum =new int[matrix.getRow()][matrix.getCol()];
            matrix2[0][0] = 11;
            matrix2[0][1] = 11;
            matrix2[0][2] = 12;
            matrix2[1][0] = 12;
            matrix2[1][1] = 8;
            matrix2[1][2] = 11;

            int[][] actual = matrix.addMatrix(matrix1,matrix2);



            assertEquals("Error!",sum,actual );
        }
    }












}
}