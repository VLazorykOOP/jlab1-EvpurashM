import java.util.Scanner;

public class MatrixTask15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n (n ≤ 15): ");
        int n = sc.nextInt();

        double[][] X = new double[n][n];
        double[] Y = new double[n];

        System.out.println("Введіть елементи матриці X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            int firstNegativeIndex = -1;

            // Знаходимо індекс першого від’ємного елемента
            for (int j = 0; j < n; j++) {
                if (X[i][j] < 0) {
                    firstNegativeIndex = j;
                    break;
                }
            }

            if (firstNegativeIndex == -1) {
                Y[i] = -1;
            } else {
                double sum = 0;
                for (int j = firstNegativeIndex; j < n; j++) {
                    sum += Math.abs(X[i][j]);
                }
                Y[i] = sum;
            }
        }

        System.out.println("\nВектор Y:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", Y[i]);
        }
    }
}
