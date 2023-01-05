package collections.SetAndHashSet;

import java.util.*;

public class Example {

    public static int getSum(List<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> ints = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            int randomNums = random.nextInt(1, 400);
            ints.add(randomNums);
        }
        System.out.println("Sum of all numbers: " + getSum(ints));

        Set<Integer> set = new HashSet<>(ints);

        set.forEach(System.out::println);
    }
}
