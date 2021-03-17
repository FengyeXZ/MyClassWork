/*
while(){
}
 */
public class Demo06While {
    public static void main(String[] args) {
        //打印1-10
        int i = 1;

        while(i<=1000){
            System.out.print(i + " ");
            i++;
            if (i >66){
                break;
            }
        }
    }
}
