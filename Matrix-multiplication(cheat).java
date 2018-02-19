import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner ( System.in );

        int a, b;

        System.out.println ( "Введите количество строк и столбцов:   " );

        a = scan.nextInt ( );
        b = scan.nextInt ( );

        int m, n;
        System.out.println ( "Введите количество строк и столбцов второй матрицы:  " );
        m = scan.nextInt ( );
        n = scan.nextInt ( );

        int result[][] = new int[10][10];


        if (b != m) {
            System.out.println ( "Multiplication is not possible." );

        } else
            System.out.println ( "Multiplication is possible:  " );
        System.out.println ( "Enter 1st matrix elements: " );

        int[][] first = new int[10][10];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                first[i][j] = scan.nextInt ( );
            }
        }
        System.out.println ( "Enter 2nd matrix elements: " );

        int[][] second = new int[10][10];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                second[i][j] = scan.nextInt ( );
            }
        }

        System.out.println ( "Multiplication result is: " );

        int res = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {

                    res = res + first[i][k] * second[k][j];
                }
                result[i][j] = res;
                res = 0;
            }

        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf ( "%d\t", result[i][j] );
            }
            System.out.println ( );
        }
    }

}
