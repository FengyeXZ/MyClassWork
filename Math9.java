import java.util.Scanner;

public class Math9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the length");
        double num1 = input.nextDouble();
        System.out.print("Enter the width");
        double num2 = input.nextDouble();
        System.out.println("The area of this rectangle is: " + num1*num2);
    }
    
}
