/*
变量

类比analogy

超市(存包)

储物柜(用来存放物品)         <==> 变量
物品类型(只能存放小物品)      <==> 数据类型

变量的概念：在程序运行期间，可以在一定范围内改变的量

变量：
1. 用来存放数据
2. 内容可以改变
3. 一次只能存放一个数据
4. 可以通过变量的名称使用
5. 里面的数据必须符合数据类型的要求

使用变量：
方法一：1. 创建一个变量 2. 存放数据
方法二：创建变量的同时存放数据

 */

import jdk.swing.interop.SwingInterOpUtils;

/*
运算符(运算符，表达式)

常见的运算符有四类：
    算术运算符
    赋值运算符
    比较运算符
    逻辑运算符
 */
public class Demo03 {
    public static void main(String[] args) {
        //使用变量方法一
        int c5;
        c5 = 5;

        //使用变量方法二
        int c1 = 6;

        System.out.println(c5); //5
        System.out.println(c1);//6
        System.out.println(c5 + c1);//11
        System.out.println((c5 + c1) * 10);//110

        System.out.println(5 % 2);//1
        System.out.println(5 / 2);//2
        System.out.println(5 / 2.00000000000000000000001);//2.5

        //注意：大家课下一定要多做实验

        System.out.println((double) 7 / 4);

        System.out.println("=============================");

        int a1 = 9;
        int a2 = 4;
        System.out.println(a1 / a2);//2
//        a1 = 9.0; //错误写法，int变量不能转换成double


        //java中的除法，只看商，不看余数
        System.out.println(9/2);//4

        double b1 = 9.0;
        double b2 = 4.0;

        b1 = (int) 9;
        b2 = (int) 4;


        System.out.println(b1 / b2);//2.25

        System.out.println((int) 9.0 / (int) 4.0);//2

        System.out.println(9 / -2);//-4
        System.out.println(-9 % 2);//-1
        System.out.println(-9 / 2);//-4
        System.out.println(-9%-2);//-1

        System.out.println(9.0%2.2);

//        System.out.println(9/0);//ArithmeticException: / by zero

        //数据类型自动转换

        int a = 10;
        long b = 100;

        System.out.println(a+b);

//        int c = a + b;//错误写法
        long d = a + b;
        System.out.println(d);
        double e = a + b; //110
        System.out.println(e);//110.0

        System.out.println(e + d);

        //数据类型强制转换

        System.out.println(a>b);//false

        //自增++ 自减--
        int num1 = 1;
        num1++; // 等同于 num = num + 1;
        System.out.println(num1);//2

        --num1;
        System.out.println(num1);//1


        int num2 = 10;
        System.out.println(num2++);//10
        System.out.println(num2);//11
        System.out.println(++num2);//12
        System.out.println(num2);//12

//        int num2 = 30;//错误写法: 一个变量只能声明一次

        // > , <, ==, !=
        System.out.println(3>2);//true
        System.out.println(3 != 3);//false
        System.out.println(3 == 3.0);//true
        System.out.println(3 == 2.999999999999999999999999999999999);
        System.out.println(3 == 2.99999999);

        boolean bb = 3==5;
        System.out.println(bb);//false

        int aa = 3+'a';
        System.out.println(aa);

        char cc = 'S';
        System.out.println(cc);//S
        System.out.println(cc == 'S');
        System.out.println('a' == 'a');//true
        System.out.println('a'==97.0);//true

        //百度"Unicode", "ASCII码"




    }
}
