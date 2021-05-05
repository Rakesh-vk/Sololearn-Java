/* 
Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

Sample Input:
hello there

Sample Output:
ereht olleh */

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int len = text.length() - 1;
		char[] arr = text.toCharArray();
		
		//your code goes here
		for (int i=len; i>=0; i--){
            System.out.print(arr[i]);
        }
        scanner.close();
	}
}