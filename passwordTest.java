import java.util.Scanner;

public class passwordTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "abc";
        System.out.println(b.equals(a));
        
        method();
        method2();
    }
    public static void method() {
        System.out.println(new Scanner(System.in).next());
    }

    public static String method2() {
        return new Scanner(System.in).next();
    }
}
