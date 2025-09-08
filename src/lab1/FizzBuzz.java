package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {

        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
//            int a = 1;
//            while (a < 100){
//                // Find out which numbers divide i.
//                boolean divisibleBy3 = a % 3 == 0;
//                boolean divisibleBy5 = a % 5 == 0;
//
//                // Print our appropriate result.
//                if (divisibleBy3 && divisibleBy5) {
//                    System.out.println("Fizz Buzz");
//
//                } else if (divisibleBy3) {
//                    System.out.println("Fizz");
//
//                } else if (divisibleBy5) {
//                    System.out.println("Buzz");
//
//                } else {
//                    System.out.println(a);
//
//                }
//                a++;
//
//            }
//        }

        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
