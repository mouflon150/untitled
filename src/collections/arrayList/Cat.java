package collections.arrayList;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(age, o.getAge());
    }
}
