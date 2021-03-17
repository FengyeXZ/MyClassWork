import java.util.Scanner;

public class Math7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the radius");
        double num = input.nextDouble();
        System.out.println("The perimeter is: " + 2*num*Math.PI);
        System.out.println("The area is: " + Math.pow(num, 2)*Math.PI);
    }
    
}
