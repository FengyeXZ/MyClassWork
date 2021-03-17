import java.util.Scanner;

/*
题：键盘输入一个整数，判断这个数的区间：0-59，60-80，81-90，91-100
 */
public class Demo04If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int score = sc.nextInt();//前面几行的意思就是键盘输入一个整数
//        int score = 70;
        if (score>=0&&score<=59){
            System.out.println("不及格");
        }else if (score>=60&&score<=80){
            System.out.println("还行");
        }else if (score>80 && score<91){
            System.out.println("优秀");
        }else {
            System.out.println("牛逼了！");
        }
    }
}
