
public class App {
	public static void main(String[] args) {
		long sum=0;
		for (long i = 1; i <= 2147483647; i++) {
			if(i%2==1) {			
				 sum+=i;
		}
			
		}
		System.out.println("奇数之和为:"+sum);
	}
}
