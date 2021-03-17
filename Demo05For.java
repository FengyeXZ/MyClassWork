/*
For循环通常用于确定循环次数的循环
 */
public class Demo05For {
    public static void main(String[] args) {
        //屏幕输出10个*
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }

        System.out.println("=======================");

        //题：从a打印到z.
        char c = 97; //小写a
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (c + i) + " ");
        }

        System.out.println();
        //屏幕输出：1234 ... 100
        for (int i = 0; i < 100; i++) {
            System.out.print(i+1 + " ");
        }

        //题：打印输出：在1-1000的整数中，能够被至少以下三个数中的两个整除的数字：4，6，9
        //思路：
        //1. 找出能够被(4，6)，（4，9）整除的数
        //2.

        System.out.println("=========================");
        System.out.println();
        //打印输出能够被4和6整除的1-1000以内的数
        for (int i = 1; i <= 1000; i++) {
            if (i%4 == 0 && i%6==0) {
                System.out.print(i + " ");
            }else if (i%4!=0 && i%6 ==0 && i%9==0)//打印不能被4整除，但是能够被6和9整除
                System.out.print(i + " ");
        }
        System.out.println();


    }
}
