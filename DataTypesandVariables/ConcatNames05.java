package DataTypesandVariables;

import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String del = scanner.nextLine();

        System.out.printf("%s%s%s", firstName, del, lastName);
    }
}
