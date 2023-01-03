package collections;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person<T> {
    private T value;

    public Person(T value) {
        this.value = value;
    }
}
