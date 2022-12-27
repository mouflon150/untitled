package collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    static String[] names = {"Bella", "Tiger", "Chloe", "Shadow", "Luna", "Oreo", "Oliver", "Kitty", "Lucy", "Molly", "Jasper", "Smokey", "Gizmo", "Simba", "Tiger",
            "Charlie", "Angel", "Jack", "Lily", "Peanut", "Toby", "Baby", "Loki", "Midnight", "Milo", "Princess", "Sophie", "Harley", "Max", "Missy", "Rocky", "Zoe", "CoCo", "Misty", "Nola",
            "Oscar", "Pepper", "Sasha", "Pumpkin", "Kiki", "Mittens", "Callie", "Lucky", "Patches", "Simon", "Garfield", "George", "Maggie", "Sammy", "Sebastian", "Boots", "Cali", "Felix", "Lilly",
            "Phoebe", "Sassy", "Tucker", "Bandit", "Dexter", "Fiona", "Jake", "Precious", "Romeo", "Snickers", "Socks", "Daisy", "Gracie", "Lola", "Sadie", "Sox", "Casper", "Fluffy", "Marley", "Minnie",
            "Sweetie", "Ziggy", "Belle", "Blackie", "Chester", "Frankie", "Ginger", "Muffin", "Murphy", "Rusty", "Scooter", "Batman", "Boo", "Cleo", "Izzy", "Jasmine", "Mimi", "Sugar", "Cupcake",
            "Dusty", "Leo", "Noodle", "Panda", "Peaches"};

    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Object> cats = new LinkedList<>();
        LinkedList<Object> dogs = new LinkedList<>();
        LinkedList<Object> mice = new LinkedList<>();
        ArrayList<LinkedList> array = new ArrayList<>();

        array.add(cats);
        array.add(dogs);
        array.add(mice);

        for (int i = 1; i < 10; i++) {
            int randomWithNextInt = random.nextInt(1, 10);
            int randomNames = random.nextInt(98);
            cats.add(new Cat(names[randomNames], randomWithNextInt));
            if (i % 3 == 0) {
                Mouse mouse = new Mouse(names[randomNames], randomWithNextInt);
                dogs.add(mouse);
            }
            dogs.add(new Dog(names[randomNames], randomWithNextInt));
            mice.add(new Mouse(names[randomNames], randomWithNextInt));
        }
        System.out.println("Удалена коллекция под 4 - индексом: " + mice.remove(4));
        System.out.println(array);
    }
}
