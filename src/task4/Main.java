package task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Alphabet.txt");
        fileWriter.write("""
                Aa Bb Cc Dd Ee Ff Gg
                Hh Ii Jj Kk Ll Mm Nn
                Oo Pp Qq Rr Ss Tt Uu
                Vv Ww Xx Yy Zz""" + "\n");
        fileWriter.write("1 2 3 4 5 6 7 8 9");
        fileWriter.close();

        FileReader fileReader = new FileReader("Alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileWriter.close();
    }
}
