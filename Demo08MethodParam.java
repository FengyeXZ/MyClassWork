public class Demo08MethodParam {
    public static void main(String[] args) {
        //打印1-100
        method1();//无参数

        System.out.println();

        //输入3个整数，求和
        method2(1,100,80);

    }
    public static void method2(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
        return;//可以空写一个return
    }

    public static void method1(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
