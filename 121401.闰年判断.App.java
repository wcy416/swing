import java.util.Scanner;


public class App {
public static void main(String[] args) {
		
		while (true) {
			Scanner sc=new Scanner(System.in);
			int year=sc.nextInt();
			if((year%4==0&&year%100!=0)||year%400==0) {
				System.out.println("公元后的闰年");
			}else if(year%4==1||year%400==1){
				System.out.println("公元前的闰年");
			}
			else {
				System.out.println("不是闰年");
			}
			
		}

	}
}

