package task4;

import java.util.ArrayList;
import java.util.Random;

public class Main implements Comparable<Integer> {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(2);

        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();


    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}