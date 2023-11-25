import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[]args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter the numbers:");
				String integers = sc.nextLine();
				System.out.println("Tokenized string");
				StringTokenizer input=new StringTokenizer(integers);
				while(input.hasMoreTokens()) {
					int num=Integer.parseInt(input.nextToken());
					System.out.println(num);
					sum=sum+num;
				}
				System.out.println("sum="+sum);
	}
}
