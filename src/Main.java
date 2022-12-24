import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter first argument");
            String snum1 = scanner.next();
            System.out.println("Enter second argument");
            String snum2 = scanner.next();
            System.out.println("Enter operation type: sum, sub, mul or div?");
            String type = scanner.next();

            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            int result;

            switch (type) {
                case "sum":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operation not found!");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue? Yes or No");
            String next = scanner.next();
            switch (next) {
                case "No":
                    return;
                case "Yes":
                    break;
            }
        }
    }
}
