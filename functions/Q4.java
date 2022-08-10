// Method to print sum of 2 nums by declaring a method 

import java.util.*;

public class Q4{
	public static int sumOfTwo(int a,int b){
		return a+b;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumOfTwo(a,b));
	}
}
