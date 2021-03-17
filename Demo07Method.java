/*
方法：若干语句功能的集合

类比：

牛奶场1
原料：奶牛，饲料，水
产出：牛奶，奶制品


方法的三要素：
名称：牛奶场1
参数列表：原料
返回值：产出

方法的调用有三种方式：
1. 单独调用
2. 打印调用
3. 赋值调用
 */
/*
方法的注意事项：
1. 方法应该定义在类当中。但是，方法中不能再定义方法，不能嵌套
2. 方法的顺序无所谓
3. 方法定义之后是不会执行的。如果希望执行，需要：3种调用
4. 如果方法有返回值，必须写return，不能没有
5. 如果方法没有返回值，可以写一个return，但是后面不能接数据，或者不写return。
6. 一个方法只能return一次。
 */
public class Demo07Method {
    public static void main(String[] args) {
        swear();

        System.out.println("爽");
        System.out.println("还不错");

        //单独调用
        swear();

        //打印调用。事实上，打印输出的是方法的返回值
        System.out.println(sum(980, 111));

        //赋值调用
        int sumNum = sum(102,78);
        System.out.println(sumNum);//180
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }





    public static void swear(){
        System.out.println("你个XXX!");
        System.out.println("你xxx的连xxxx都不会吗?");
        System.out.println("xxxxxxxxxxx!");
        System.out.println("以后你再来我xxxxxxxxxxxx你!");
    }
}
