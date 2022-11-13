import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"Введите первое число: ", "Введите второе число: ",
                "Выберите операцию: " + "\n".concat("""
                        - прибавить (+);
                        - отнять (-);
                        - умножить (*);
                        - разделить (/)."""), "Результат: "};
        Scanner scanner = new Scanner(System.in);
        System.out.println(strings[0]);
        double firstNumber = scanner.nextDouble();
        System.out.println(strings[1]);
        double secondNumber = scanner.nextDouble();
        System.out.println(strings[2]);
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.println(strings[3] + plus(firstNumber, secondNumber));
            case '-' -> System.out.println(strings[3] + minus(firstNumber, secondNumber));
            case '*' -> System.out.println(strings[3] + multiplication(firstNumber, secondNumber));
            case '/' -> System.out.println(strings[3] + division(firstNumber, secondNumber));
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