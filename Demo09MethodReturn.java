public class Demo09MethodReturn {
    public static void main(String[] args) {
        //求三个数字之和，赋值调用
        int num = sum(1,78,99);
        System.out.println(num);

        //打印A到Z
        method();
//        System.out.println(method());//错误写法，不能打印输出没有返回值的方法
    }

    public static void method(){
        char c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print((char)(c+i) + " ");
        }
    }


    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


}
