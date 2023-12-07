import java.util.Objects;
import java.util.Scanner;

public class Calc {
    public static void calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number: ");
        Integer num = scan.nextInt();

        Scanner scan_two = new Scanner(System.in);
        System.out.println("enter operator: ");
        String op = scan_two.nextLine();

        Scanner scan_three = new Scanner(System.in);
        System.out.println("enter number: ");
        Integer num_two = scan.nextInt();

        if (Objects.equals(op, "+")) {
            System.out.println(num + num_two);
            Storage.results.add(num + num_two);
        } else if (Objects.equals(op, "-")) {
            System.out.println(num - num_two);
            Storage.results.add(num - num_two);
        } else if (Objects.equals(op, "/")) {
            System.out.println(num / num_two);
            Storage.results.add(num / num_two);
        } else if (Objects.equals(op, "*")) {
            System.out.println(num * num_two);
            Storage.results.add(num * num_two);
        }
        Main.repeat_question();
    }
}
