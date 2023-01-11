package task3;

import lombok.Data;

@Data
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
