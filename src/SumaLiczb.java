import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumbersOperations {
    public static void main(String[] args) {
        List<Integer> userNumbers = getNumbersFromUser();
        List<Integer> positiveNumbers = getPositiveNumbers(userNumbers);
        List<Integer> negativeNumbers = getNegativeNumbers(userNumbers);
        int positiveNumbersSum = positiveNumbersSum(positiveNumbers);
        int negativeNumbersSum = negativeNumbersSum(negativeNumbers);
        printResults(positiveNumbersSum, negativeNumbersSum);
    }

    private static void printResults(int positiveNumbersSum, int negativeNumbersSum) {
        System.out.println("Suma wprowadzonych liczb dodatnich: " + positiveNumbersSum);
        System.out.println("Suma wprowadzonych liczb ujemnych: " + negativeNumbersSum);
    }

    private static int negativeNumbersSum(List<Integer> negativeNumbers) {
        int negativeNumbersSum = 0;
        for (int i = 0; i < negativeNumbers.size(); i++) {
            negativeNumbersSum += negativeNumbers.get(i);
        }
        return negativeNumbersSum;
    }

    private static int positiveNumbersSum(List<Integer> positiveNumbers) {
        int positiveNumbersSum = 0;
        for (int i = 0; i < positiveNumbers.size(); i++) {
            positiveNumbersSum += positiveNumbers.get(i);
        }
        return positiveNumbersSum;
    }

    private static List<Integer> getNegativeNumbers(List<Integer> userNumbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) < 0)
                negativeNumbers.add(userNumbers.get(i));
        }
        return negativeNumbers;
    }

    private static List<Integer> getPositiveNumbers(List<Integer> userNumbers) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) >= 0)
                positiveNumbers.add(userNumbers.get(i));
        }
        return positiveNumbers;
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
