import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MathTest {

    public static void main(String[] args) {
        mathQuestions();
    }

    /**
     * <p>Gives the user a series of Mathematical questions including 2 step equations.</p>
     * <p>for statement will count the amount of times a user has answered a question correctly.</p>
     * @author marcusxg on GitHub
     */
    public static void mathQuestions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String answer = scan.nextLine();
        System.out.println("Hello, " + answer);

        String[] questions = {
                "Q1. 2x + 3 = 5: ---> ",
                "Q2. 3x + 2(3 - 1) = 5: ---> "
        };

        String[] answers = {"1", "0.3"};
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            String userAnswer = scan.nextLine();

            if (Objects.equals(userAnswer, answers[i])) {
                System.out.println("Correct!");
                Storage.score.add(1);

            } else {
                System.out.println("Incorrect");
            }
            System.out.println("Score: " + Storage.score.size() + " out of 2" + "\n");
        }

        Main.repeat_question();
    }
}
