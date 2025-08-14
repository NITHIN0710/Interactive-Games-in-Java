import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("**SIMPLE CALCULATOR**");
            System.out.print("Enter number1: ");
            double n1 = sc.nextDouble();
            System.out.print("Enter number2: ");
            double n2 = sc.nextDouble();
            System.out.print("Enter operation (+, -, *, /, %): ");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case '+':
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;

                case '-':
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;

                case '*':
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;

                case '/':
                    if (n2 != 0) {
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    } else {
                        System.out.println("Error! Division by Zero!");
                    }
                    break;

                case '%':
                    System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
                    break;

                default:
                    System.out.println("Invalid operation. Please enter +, -, *, /, or %.");
            }
            sc.nextLine();
            System.out.print("Do you want to continue (yes/no): ");
            String input = sc.next().trim().toLowerCase();
            if (input.equals("no") || input.equals("n")) {
                cont = false;
                System.out.println("Exiting...");
            }
        }
        sc.close();
    }
}
