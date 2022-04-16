package kata_test_calculator;

import java.util.Scanner;

class StartCalc {
    public static void main(String[] args) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        new Main();
        Main.calc(input);
    }
}

