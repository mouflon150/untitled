public class ReversedNumber {
    public static void main(String[] args) {
        reverse(-2344);
    }

    public static void reverse(int number) {

        int reversed = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            if (number > 999 || number < -999) {
                reversed = 0;
                break;
            }
        }
        System.out.println("Reversed Number: " + reversed);

    }
}

