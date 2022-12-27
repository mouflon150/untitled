package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka", 1));
        cats.add(new Cat("Love", 6));
        cats.add(new Cat("Lila", 8));
        cats.add(new Cat("Enemy", 2));
        cats.add(new Cat("Soldier", 8));
        cats.add(new Cat("Puppy", 9));
//        for (Cat cat : catList) {
//            if (cat.getName().equals("Murka") && cat.getAge() == 1) {
//                System.out.println(catList.contains(cat));
//                System.out.println(catList.indexOf(cat));
//            }
//        }
        Collections.sort(cats);
        cats.forEach(System.out::println);
    }
}
