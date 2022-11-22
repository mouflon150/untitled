package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        do {
            System.out.println("1 --> save user");
            System.out.println("2 --> find all");
            System.out.println("3 --> delete user");
            System.out.println("4 --> clear all");
            System.out.println("5 --> update");
            int num = scanner.nextInt();
            if (num == 1) {
                userList.add(new User(scanner.next(), scanner.next(), scanner.nextInt()));
            }
            if (num == 2) {
                System.out.println(userList);
            }
            if (num == 3) {
                System.out.println("id:");
                int a = scanner.nextInt();
                userList.remove(a);
            }
            if (num == 4) {
                userList.clear();
            }
            if (num == 5) {
                System.out.println("id:");
                int b = scanner.nextInt();
                userList.set(b, new User(scanner.next(), scanner.next(), scanner.nextInt()));
            }
        } while (true);
    }
}

class User {
    private String userName;
    private String userSurname;
    private int userAge;

    public User(String userName, String userSurname, int userAge) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "name: " + userName + "\n" + "surname: " + userSurname + "\n" + "age: " + userAge;
    }
}


