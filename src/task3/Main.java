package task3;

public class Main {

    public static void main(String[] args) {

        // try with resources
        try (Car car = new Car()) {
            car.setBrand("Lexus");
            car.setCarNumber(177);
            car.ride();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
