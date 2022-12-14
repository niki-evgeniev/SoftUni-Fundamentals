package ExerciseDataTypesandVariables;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int nHalfProponent = n / 2;

        while (n >= m) {
            n -= m;
            count++;
            if (n == nHalfProponent) {
                if (n > 0) {
                    if (y > 0) {
                        n = n / y;
                    }
                }
            }
        }

        System.out.println(n);
        System.out.println(count);
    }
}
