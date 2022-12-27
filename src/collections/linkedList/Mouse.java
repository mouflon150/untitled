package collections.linkedList;

import lombok.Data;

@Data
public class Mouse {
    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nMouse(" +
                "name = " + name +
                ", age = " + age +
                ')';
    }
}
