/*
题：判断两个整数是否相等

方法的三要素：
方法名称：isSame
参数列表：int num1, int num2
返回值：boolean
 */
public class Demo10TwoNumberSame {
    public static void main(String[] args) {
        System.out.println(isSame(28, 98));//false
    }

    public static boolean isSame(int num1, int num2){
//        if (num1 == num2) return true;
//        else return false;
        //还有一种写法
        return num1 == num2;
    }
}
