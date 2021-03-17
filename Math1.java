import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your first number");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println();
        System.out.println("the sum is"+sum);
    }
}