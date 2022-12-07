package task2;

public class Test {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("");
        int[] arr = {1, 2, 3, 4, 5};

        for (int a : arr) {
            stringBuilder.append(a);
        }
        System.out.print(stringBuilder);
    }
}