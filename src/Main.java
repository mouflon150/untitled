import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.println(plus(firstNumber, secondNumber));
            case '-' -> System.out.println(minus(firstNumber, secondNumber));
            case '*' -> System.out.println(multiplication(firstNumber, secondNumber));
            case '/' -> System.out.println(division(firstNumber, secondNumber));
            default -> System.out.println("Неправильная операция!");
        }


    }

    public static double plus(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double minus(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("На нуль делить нельзя!");
        }
        return firstNumber / secondNumber;

    }
}