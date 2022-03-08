package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Botto", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("I can guess your age!");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int div3 = scanner.nextInt();
        int div5 = scanner.nextInt();
        int div7 = scanner.nextInt();
        int age = (div3 * 70 + div5 * 21 + div7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a pretty good time to start programming!");
    }

    static void count() {
        System.out.println("I can even count to any number you give me!");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What programming langauge is the closest to the English langauge? Enter a number 1-4.");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. C");
        System.out.println("4. Bracket");
        int guess = scanner.nextInt();
        while (guess!=1){
            System.out.println("Please, try again.");
            guess = scanner.nextInt();
        }
        
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
