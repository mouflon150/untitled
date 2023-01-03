package collections;

import java.util.LinkedList;

public class Quiz {

    public static <T> void generic(LinkedList<T> arrayList) {
        arrayList.forEach(System.out::println);
        System.out.println("First: " + arrayList.getFirst());
        System.out.println("Last: " + arrayList.getLast());
    }

    public static void main(String[] args) {

        LinkedList<Person> persons = new LinkedList<>();

        persons.add(new Person<>(17));
        persons.add(new Person<>("Marlen"));
        persons.add(new Person<>(17.5));
        persons.add(new Person<>(true));
        persons.add(new Person<>('M'));
        generic(persons);


//        // Списки
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        for (String l : list) {
//            System.out.println(l);
//        }
//
//        // Очереди
//        Queue<Integer> queue = new PriorityQueue<>(5);
//        queue.add(15);
//        queue.add(1);
//        queue.add(32);
//        queue.add(50);
//        queue.add(100);
//        System.out.println(queue);
//
//        // Словари
//        Map<Character, String> stringMap = new TreeMap<>();
//        stringMap.put('a', "Marlen");
//        stringMap.put('b', "Sardor");
//        stringMap.put('c', "Bakyt");
//        System.out.println(stringMap.get('c'));
//
//        // Наборы
//        Set<String> stringSet = new TreeSet<>();
//        stringSet.add("Marlen");
//        stringSet.add("Sardor");
//        stringSet.add("Bakyt");
//        System.out.println(stringSet.contains("Marlen"));
//
//        Stack<String> stack = new Stack<>();
//        stack.add("Call of Duty");
//        stack.add("Super Monkey Ball");
//        stack.add("Counter Strike");
//        stack.peek();
//        System.out.println(stack);
    }
}


