
import java.util.Random;
import java.util.Scanner;

public class Sjzb {
    public static void main(String[] args) {
        System.out.println("请输入生成随机数的个数");

        while (true){
            Scanner sc=new Scanner(System.in);
            int shu=sc.nextInt();
            if (shu==1){
                int x=(int)(Math.random()*100%100);
                int y=(int)(Math.random()*100%100);
                System.out.println("坐标（"+x+","+y+")");
            }else {
                System.out.println("错误");
            }
        }
    }
}
