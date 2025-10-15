import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Варіант 1: дійсні вхідні дані, дійсний результат
        System.out.println("Варіант 1: дійсні вхідні дані, дійсний результат");
        System.out.print("Введіть a: ");
        double a1 = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b1 = sc.nextDouble();
        double result1 = a1 + (a1 + b1 - 1) / (a1 * a1 + 2) - Math.pow(a1 * b1, 3);
        System.out.println("Результат: " + result1);

        // Варіант 2: цілі вхідні дані, дійсний результат
        System.out.println("\nВаріант 2: цілі вхідні дані, дійсний результат");
        System.out.print("Введіть a: ");
        int a2 = sc.nextInt();
        System.out.print("Введіть b: ");
        int b2 = sc.nextInt();
        double result2 = a2 + (double)(a2 + b2 - 1) / (a2 * a2 + 2) - Math.pow(a2 * b2, 3);
        System.out.println("Результат: " + result2);

        // Варіант 3: дійсні вхідні дані, цілий результат
        System.out.println("\nВаріант 3: дійсні вхідні дані, цілий результат");
        System.out.print("Введіть a: ");
        double a3 = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b3 = sc.nextDouble();
        int result3 = (int) (a3 + (a3 + b3 - 1) / (a3 * a3 + 2) - Math.pow(a3 * b3, 3));
        System.out.println("Результат: " + result3);

        sc.close();
    }
}

