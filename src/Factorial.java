import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            counter *= i;
        }
        System.out.println(counter);
        for (int i = 1; i <= number; i++) {
            counter = 1;
            System.out.print(i + "! = ");
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(j + " * ");
                }
                counter *= j;
            }
            System.out.println(" = " + counter);
        }
    }
}