import java.util.*;

public class N2 {
    public static void main(String[] args) {

        // Автоматичні дані
        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5};

        // Виведення початкових масивів
        System.out.println("Масив A: " + Arrays.toString(A));
        System.out.println("Масив B: " + Arrays.toString(B));

        // Використаємо множини (для унікальних елементів)
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int x : A) setA.add(x);
        for (int x : B) setB.add(x);

        // Обчислення симетричної різниці: (A \ B) ∪ (B \ A)
        Set<Integer> symDiff = new HashSet<>(setA);
        symDiff.removeAll(setB); // A \ B

        Set<Integer> temp = new HashSet<>(setB);
        temp.removeAll(setA);    // B \ A

        symDiff.addAll(temp);    // (A \ B) ∪ (B \ A)

        // Перетворимо у масив C
        int[] C = new int[symDiff.size()];
        int i = 0;
        for (int val : symDiff) {
            C[i++] = val;
        }

        // Виведення результату
        System.out.println("Масив C (симетрична різниця): " + Arrays.toString(C));
    }
}
