// Given number is odd or not

import java.util.*;

public class Q2{
	public static String evenOdd(int num){
		if(num%2==0){
			return "Even";
		}
			return "Odd";
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(evenOdd(n));
	}
}
