import java.util.Scanner;

public class Math6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your number");
        double num = input.nextDouble();
        int x = 1;
        while( x <= 10 ){
            System.out.println("×"+x+": "+x*num);
            x++;
        }
    }
    
}
