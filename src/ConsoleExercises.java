import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);



    Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
    int userInput = scanner.nextInt();
        System.out.println("You entered: --> \""+userInput+"\" <--");

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your three words are: %s, %s, %s%n", firstWord, secondWord, thirdWord);

        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence is: %s%n", sentence);

        System.out.print("Enter the length of my office: ");
        String length = scanner.nextLine();
        System.out.print("Enter the width of my office: ");
        String width = scanner.nextLine();
        System.out.print("Enter the height of my office: ");
        String height = scanner.nextLine();
        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = (Integer.parseInt(length) * 2) + (Integer.parseInt(width) * 2);
        System.out.printf("The area of the office is: %d%n", area);
        System.out.printf("The perimeter of the office is: %d%n", perimeter);
        System.out.printf("The volume of the office is: %d%n", area * Integer.parseInt(height));


}
}


