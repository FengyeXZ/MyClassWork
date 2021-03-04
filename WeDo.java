import java.util.Scanner;

public class WeDo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Declaration variables and store values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //Mathmatic operation
        double s = a + b + c;
        double p = a * b * c;
        double avg = s / 3;
        //Print the result
        System.out.println(s);
        System.out.println(p);
        System.out.println(avg);
        // If we use the package java.long.Math, this is the code
        System.out.println(Math.max(s, Math.max(p, avg)) + " is the maximum");
        System.out.println(Math.min(s, Math.min(p, avg)) + " is the minimum");
        // If we use the "if", this is the code
        if (s < p && s < avg) {
            System.out.println(s + " is the minimum");
            if (p < avg) {
                System.out.println(avg + " is the maximum");
            }
            else{
                System.out.println(p + " is the maximum");
            }
        } else if (p < s && avg < s) {
            System.out.println(s + " is the maximum");
            if (p < avg) {
                System.out.println(p + " is the minimum");
            }
            else{
                System.out.println(avg + " is the minimum");
            }
        } else if (p < avg) {
            System.out.println(p + " is the minimum");
            System.out.println(avg + " is the maximum");
        } else {
            System.out.println(p + " is the maximum");
            System.out.println(avg + " is the minimum");
        }
        
    }
    
}
