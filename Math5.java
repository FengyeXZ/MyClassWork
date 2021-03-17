import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println();
        System.out.println("the sum is"+sum);
        double product = num1 * num2;
        System.out.println("the product is"+product);
        double difference = num1 - num2;
        System.out.println("the difference is"+difference);
        double quotient = num1 / num2;
        System.out.println("the quotient is"+quotient);
        int ramainder = (int) (num1 % num2);
        System.out.println("the ramainder is"+ramainder);
    }
}
