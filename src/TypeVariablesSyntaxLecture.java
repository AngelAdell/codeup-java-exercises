public class TypeVariablesSyntaxLecture {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement");
        System.out.println("This statement must end in a semi-colon");

        // In Java, every statement must end with a semicolon.
        int someNumber = 3;
        System.out.println(someNumber);
        someNumber = 126;
        someNumber++;
        System.out.println(someNumber);

//        int numDefault;
//        numDefault = 0; // This is a statement
//        System.out.println(numDefault);

        char someLetter = 'c';
        System.out.println(someLetter);

        String someString = "Codeup is awesome!";
        System.out.println(someString);

        String quotedString = "This is a \"quoted\" String";
        System.out.println(quotedString);

        final String finalString = "This is a \"Angel's\" final string";

        byte myFirstByte = 127;
        short myFirstShort = (short) (myFirstByte * 100);
        System.out.println(myFirstShort);

        float almostPi = 3.99F; // F is required for floats
        int almostPiToInt = (int) (almostPi);
        System.out.println(almostPiToInt);
        System.out.println(almostPi);
        long bigNumber = 3000000000L; // L is required for longs

    }
}