package collections.linkedList;

import lombok.Data;

@Data
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nDog(" +
                "name = " + name +
                ", age = " + age +
                ')';
    }
}
