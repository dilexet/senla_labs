package com.senla;

public class Main {

    public static int generationNaturalNumber(int min, int max) {
        return new java.util.Random().nextInt(max - min + 1) + min;
    }

    // Task 1.1
    public static int largestDigitNumber(int number) {
        int max = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }

    // Task 1.2
    private static int firstDigitNumber(int number) {
        while (number > 9) {
            number /= 10;
        }
        return number;
    }

    public static int sumFirstDigitNumbers(int[] numbers) {
        int sum = 0;
        for (var number : numbers) {
            sum += firstDigitNumber(number);
        }
        return sum;
    }

    // Task 1.3
    private static long concatenateDigits(int[] numbers) {
        StringBuilder str = new StringBuilder();
        for (var number : numbers) {
            str.append(number);
        }
        return Long.parseLong(str.toString());
    }

    public static long differenceNumbers(int numberOne, int numberTwo, int numberThree){
        return concatenateDigits(new int[]{numberOne, numberTwo}) - numberThree;
    }

    // Task 1.4
    public static int sumDigitNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int numberOne = generationNaturalNumber(100, 999);
        int numberTwo = generationNaturalNumber(100, 999);
        int numberThree = generationNaturalNumber(100, 999);

        System.out.printf("\nThe generated numberOne is %d", numberOne);
        System.out.printf("\nThe generated numberTwo is %d", numberTwo);
        System.out.printf("\nThe generated numberThree is %d\n", numberThree);

        // 1.1
        System.out.printf("\nThe largest digit of a numberOne is %d\n", largestDigitNumber(numberOne));

        // 1.2
        System.out.printf("\nThe sum first digit of numbers is %d\n", sumFirstDigitNumbers(new int[]{numberOne, numberTwo, numberThree}));

        // 1.3
        System.out.printf("\nThe difference numbers is %d\n", differenceNumbers(numberOne, numberTwo, numberThree));

        // 1.4
        System.out.printf("\nThe sum digit of a numberOne is %d\n", sumDigitNumber(numberOne));
    }
}
