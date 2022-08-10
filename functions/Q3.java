// Check whether a person is eligible to vote or not 

import java.util.*;

public class Q3{
	public static String EligibilityCheck(int age){
		if(age<18){
			return "Not Eligible";
		}
		return" Eligible";
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(EligibilityCheck(age));
	}
}
