import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class NumbersOperations {
    public static void main(String[] args) {
        List<Integer> userNumbers = getNumbersFromUser();
        List<Integer> positiveNumbers = filterNumbers(userNumbers, x -> x >= 0);
        List<Integer> negativeNumbers = filterNumbers(userNumbers, x -> x < 0);
        int positiveNumbersSum = sumNumbers(positiveNumbers);
        int negativeNumbersSum = sumNumbers(negativeNumbers);
        printResults(positiveNumbersSum, negativeNumbersSum);
    }

    private static void printResults(int positiveNumbersSum, int negativeNumbersSum) {
        System.out.println("Suma wprowadzonych liczb dodatnich: " + positiveNumbersSum);
        System.out.println("Suma wprowadzonych liczb ujemnych: " + negativeNumbersSum);
    }

    private static int sumNumbers(List<Integer> positiveNumbers) {
        int positiveNumbersSum = 0;
        for (int i = 0; i < positiveNumbers.size(); i++) {
            positiveNumbersSum += positiveNumbers.get(i);
        }
        return positiveNumbersSum;
    }

    private static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (predicate.test(numbers.get(i)))
                filteredNumbers.add(numbers.get(i));
        }
        return filteredNumbers;
    }

    private static List<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();
        System.out.println("Ile liczb wczytać?");
        int numberOfNumbers = scanner.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Podaj kolejną liczbę:");
            userNumbers.add(scanner.nextInt());
        }
        return userNumbers;
    }
}
