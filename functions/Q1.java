import java.util.*;

public class Q1{
	static int largest(int a,int b,int c){
		if(a>b && a>c){
			return a;
		}
		if(b>c && b>a){
			return b;
		}else{
			return c;
		}
	}

	public static void main(String args[]){
		int a = 10,b=15,c=20;
		System.out.println(largest(a,b,c));
	}
}
