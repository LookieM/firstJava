public class Matrix {
    public static void main(String[] args) {

            int[][] matrix = new int[10][10];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = i;
                    }
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

