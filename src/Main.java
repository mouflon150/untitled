import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(plus(firstNumber,secondNumber));
                break;
            case '-':
                System.out.println(minus(firstNumber,secondNumber));
                break;
        }



    }
    public static int plus (int a, int b) {
        return a + b;
    }
    public static int minus (int a, int b) {
        return  a - b;
    }
}