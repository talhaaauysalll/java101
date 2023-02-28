package Arrays;

public class MatrisTranpozuBulma {
    public static void main(String[] args) {
        int[][] matrix={{2,3,4},{5,6,4}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
