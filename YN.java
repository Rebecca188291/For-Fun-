import java.util.Scanner;
public class YN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey! Hey you!");
        System.out.println("...");
        System.out.println("...Are you ignoring me?");
        String Answer1 = scanner.next();
        System.out.println("Good! What's your name, kid?");
        String Answer3 = scanner.next();
        System.out.println(Answer3 + "? Wow, what a beautiful name. I wonder if your face is beautiful, too. Is it?");
        String Answer2 = scanner.next();
        System.out.println("Oh really? What is your first initial?");
        char c = scanner.next().charAt(0);
        if (c == 'H') {
            System.out.println("Wow, you must be like 70% pretty or something");
        }
        if (c == 'A') {
            System.out.println("Yeah right, Ms. 100%");
        }
        if (c == 'L') {
            System.out.println("Ah a fellow 80%!");
        }
        if (c == 'M') {
            System.out.println("What are you? A dog?");
        }
        if (c == 'S'){
            System.out.println("Wait a minute... Are you Russian?");
        }
    }
}