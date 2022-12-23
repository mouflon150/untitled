package task3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Car implements AutoCloseable, Rideable {

    private String brand;
    private int carNumber;

    @Override
    public void close() {
        System.out.println("Машина закрывается.");
    }

    @Override
    public void ride() {
        System.out.println("Машина поехала.");
    }
}
