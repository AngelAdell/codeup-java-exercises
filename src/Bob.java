import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a message for Bob:(type stop to quit) ");
            String inputUser = scanner.nextLine();

            if (inputUser.equalsIgnoreCase("stop")) {
                break;
            } else if (inputUser.endsWith("?")) {
                String message = "Sure?";
                System.out.println(message);
            } else if (inputUser.endsWith("!")) {
                String message = "Whoa, chill out!";
                System.out.println(message);
            } else if (inputUser.endsWith("")) {
                String message = "Fine. Be that way!";
                System.out.println(message);
            } else {
                String message = "Whatever.";
                System.out.println(message);
            }
        }
    }
}


