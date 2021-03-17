import java.util.Scanner;

public class Math8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your 1st number");
        double num1 = input.nextDouble();
        System.out.print("Enter your 2nd number");
        double num2 = input.nextDouble();
        System.out.print("Enter your 3rd number");
        double num3 = input.nextDouble();
        System.out.println("The average is: " + (num1+num2+num3)/3);
    }
}