package collections;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person<T, S> {
    private T name;
    private S age;
    public Person(T name, S age) {
        this.name = name;
        this.age = age;
    }
}
