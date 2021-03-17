/*
定义两个方法：max(参数)，和min（参数），找出三个数字种的最大值，最小值
 */
public class Demo11MethodMaxMin {
    public static void main(String[] args) {
        int minNum = min(5,3,1);
        System.out.println("最小数字是:" + minNum);
    }

    public static int min(int num1, int num2, int num3){
        int min;
//        if (num1<num2){
//            min = num1;
//        }else {
//            min = num2;
//        }
//
//        if (min < num3){
//            return min;
//        }else return num3;

        //更加简单的写法如下：
        min = num1 < num2?num1:num2;//找出num1和num2种的最小值，并且赋值给min
        min = min < num3?min:num3;
        return min;

    }
}
