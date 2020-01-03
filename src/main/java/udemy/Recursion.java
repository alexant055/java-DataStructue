package udemy;

public class Recursion {

    public static void main(String[] args) {
        int[] array = {10, 20, 5, 6, 7, 2, 3, 56, 34, 45, 32};
        printRecursive(5);
        System.out.println("Sum: " + sum(10));
        System.out.println("Factorial value: " + factorial(10)); // 10! or n!
        System.out.println("Fibonacci Series: " + fibonacci(10));
        System.out.println("Find Biggest number: " + findBiggestNumber(array));

    }

    // Using Stack memory
    private static void printRecursive(int limit) {
        if (limit <= 0) return;
        else printRecursive(limit - 1);

        System.out.println("Value: " + limit);
    }

    private static int factorial(int limit) {
        if (limit == 0) return 1;
        else return (limit * factorial(limit - 1));
    }

    private static int sum(int range) {
        if (range == 0) return 0;
        else return (range + sum(range - 1));
    }

    private static int fibonacci(int range) {
        if (range < 1) return 0;
        else if (range <= 2) return range - 1;
        else return (fibonacci(range - 1) + fibonacci(range - 2));
    }

    private static int findBiggestNumber(int[] array) {

        return array[array.length - 1];
    }
}
