//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//
//}

//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
//    }
//}


//        String myString = "Angel";
//        System.out.println(myString);

//        class CharToString {
//            public static void main(String[] args) {
//                // Original string
//                String myString = "Angel";
//                System.out.println("Original myString: " + myString);
//
//                // Assigning a character value to myString using constructor
//                char myChar = 'A';
//                myString = new String(new char[]{myChar});
//                System.out.println("myString using char: " + myString);
//            }
//        } // end class CharToString
//    }
//}

//    class FloattoString {
//    public static void main(String[] args) {
//        floatMyString = 3.14159F;  // This will result in a compilation error
//        System.out.println("myString: " + floatMyString);
//    }
//}

//class LongVariable {;
//    static long myNumber; // This will result in a compilation error {
//    public static void main(String[] args) {
//        myNumber = 3.14;
//        System.out.println(myNumber);
//    }
//}


// class LongVariable {
//    static long myNumber;
//    public static void main(String[] args) {
//        myNumber = 123L;
//        System.out.println("myNumber" + myNumber);
//    }
//}

// class LongVariable {
//    static long myNumber;
//    public static void main(String[] args) {
//        myNumber = 123;
//        System.out.println("myNumber: " + myNumber);
//    }
//}

//class longVariable {
//    static float myNumber;
//    public static void main(String[] args) {
//        myNumber = 3.14F;
//        System.out.println("myNumber: " + myNumber);
//    }
//}

//public class HelloWorld {
//    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//    }
//}

//public class HelloWorld {
//    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//    }
//}

//public class Class {
//    public static void main(String[] args) {
//    }
//}
// class is a reserved word in Java. You cannot use it as a variable name.

//class ThreeObjectExample {
//    public static void main(String[] args) {
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // This line will throw a ClassCastException
//    }
//}

//public class HelloWorld{
//    public static void main(String[] args) {
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//    }
//}

// public class HelloWorld {
//    public static void main(String[] args) {
//        int x = 4;
//        x += 5;
//        System.out.println(x);}
//}

// public class HelloWorld {
//         public static void main(String[] args) {
//                 int x = 3;
//                 int y = 4;
//                 y *= x;
//                 System.out.println(y);
//         }
// }
//
//
//public class HelloWorld {
//        public static void main(String[] args) {
//                int x = 10;
//               int y = 2;
//              x /= y;
//                System.out.println(x);
//        }
//}

//
//public class HelloWorld {
//        public static void main(String[] args) {
//                int y = 2;
////                      y -= x;
//                System.out.println("Result y: " + y);
//        }
//}
public class HelloWorld {
        public static void main(String[] args) {
                int bigInt = Integer.MAX_VALUE + 1;
                System.out.println(bigInt);
        }
}