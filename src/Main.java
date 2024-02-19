import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        user();
        repeat_question();
    }

    public static void user() {
        Scanner scan = new Scanner(System.in);
        System.out.println("username: ");
        String answer = scan.nextLine();
        Scanner scan_2 = new Scanner(System.in);
        System.out.println("password: ");
        String answer_2 = scan_2.nextLine();

        if (!Objects.equals(answer, "Washington") || !Objects.equals(answer_2, "1776")) {
            System.out.println("Incorrect");
            user();
        }

    }
    public static void repeat_question() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-calculator \n-math test \n-show list \n-finished \nenter command: ");
        String answer = scan.nextLine();

        switch (answer) {
            case "calculator" -> Calc.calculator();
            case "math test" -> MathTest.mathQuestions();
            case "finished" -> {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            case "show list" -> {
                System.out.println(Storage.results);
                repeat_question();
            }
            case null, default -> {
                System.out.println("Invalid Command... ");
                repeat_question();
            }
        }
    }
}
