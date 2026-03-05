import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumbersOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();
        System.out.println("Ile liczb wczytać?");
        int numberOfNumbers = scanner.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Podaj kolejną liczbę:");
            userNumbers.add(scanner.nextInt());
        }
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) >= 0)
                positiveNumbers.add(userNumbers.get(i));
        }
        List<Integer> negativeNumbers = new ArrayList<>();
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) < 0)
                negativeNumbers.add(userNumbers.get(i));
        }
        int positiveNumbersSum = 0;
        for (int i = 0; i < positiveNumbers.size(); i++) {
            positiveNumbersSum += positiveNumbers.get(i);
        }
        int negativeNumbersSum = 0;
        for (int i = 0; i < negativeNumbers.size(); i++) {
            negativeNumbersSum += negativeNumbers.get(i);
        }
        System.out.println("Suma wprowadzonych liczb dodatnich: " + positiveNumbersSum);
        System.out.println("Suma wprowadzonych liczb ujemnych: " + negativeNumbersSum);
    }
}
