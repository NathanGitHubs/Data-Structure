package hw1;
import java.util.*;

public class PersonalizedHelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";

        while(name.length() == 0) {
            System.out.println("What is your name?");
            name = input.nextLine();
        }

        System.out.println("Hello, " + name + "!");
    }
}
