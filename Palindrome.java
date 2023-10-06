/*
 * File        : Palindrome.java
 * Description : To Check whether a word is Palindrome or not
 * Author      : Diya Benny
 * Version     : 1.0
 * Date        : 06/10/2023
 * 
 */

import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String word=sc.next();
		boolean isPalindrome=check(word);
		if(isPalindrome)
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given srting is not Palindrome");
		}
	}
	static boolean check(String word)
	{
		char []charArray=word.toCharArray();
		int length=word.length();
		for(int i=0;i<=length/2;i++)
		{
			if(charArray[i]!=charArray[length-i-1])
			{
				return false;
			}
		}
		return true;
}
}