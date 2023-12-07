/*
 * File        : Positiveornegative.java
 * Description : To check whether a number is positive or negative
 * Author      : Diya Benny
 * Version     : 1.0
 * Date        : 27/09/2023
 * 
 */
import java.util.Scanner;
public class Positiveornegative {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("NO IS ZERO");
		}
		else if(num>0)
		{
			System.out.println("NO IS POSITIVE");
		}
		else
		{
			System.out.println("NO IS NEGATIVE");
		}
	}

}
