import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i <= 98);

//        Alter your loop to count backwards by 5's from 100 to -10.
//        Why do I have to increment the range numbers so that the loop will stop at 100?
//        int i = 105;
//        do {
//            i -= 5;
//            System.out.println(i);
//        } while (i >= -5);

//      Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i >0 && i < 1000000);

        //Refactor the previous two exercises to use a for loop instead
//        for (int i = 2; i > 0 && i < 1000000; i *= i) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        Write a program that prints the numbers from 1 to 100.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz, ");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz, ");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz, ");
//            } else {
//                System.out.println(i + ", ");
//            }
//
//        }

//        Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        int userInput = 0;
//        String userChoice = "y";
//        do {
//            System.out.println("Choose a number you would like to go up to?");
//            userInput = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                // %-6d means left-justify six digits
//                System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            userChoice = scanner.next();
//        } while (userChoice.equalsIgnoreCase("y"));
//
//        scanner.close();

//        Convert given number grades into letter grades.
//
        int grades = 0;
        System.out.println("Enter a grade from 0 to 100");
        grades = scanner.nextInt();

        String letterGrade = "";
        do {
            if (grades >= 88) {
                letterGrade = "A";
            } else if (grades >= 80) {
                letterGrade = "B";
            } else if (grades >= 67) {
                letterGrade = "C";
            } else if (grades >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            {
                System.out.println(letterGrade);
            }
            System.out.print("Do you want to continue? (y/n): ");
            letterGrade = scanner.next();
        } while (letterGrade.equalsIgnoreCase("y"));

    }
}



