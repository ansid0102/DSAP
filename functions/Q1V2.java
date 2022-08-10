import java.util.*;

public class Q1V2{
	static int largest(int a,int b,int c){
		int max = a;
		if(max<b){
			max =b;
		}
		if(max<c){
			max = c;
		}
		return max;
	}

	public static void main(String args[]){
		int a = 10,b=15,c=20;
		System.out.println(largest(a,b,c));
	}
}
