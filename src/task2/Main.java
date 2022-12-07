package task2;

public class Main {

    public static void main(String[] args) {

        Region[] regions = Region.values();

        for (Region region : regions) {
            System.out.println(region + "\t" + region.feature);
        }
        System.out.println();
    }
}

