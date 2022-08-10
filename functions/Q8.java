import java.util.*;
public class Q8{
	public static void gradeIs(int m){
		if(m<=40){
			System.out.println("Fail");
		}
		if(m>=41 && m<=50){
			System.out.println("DD");
		}
		if(m>=51 && m<=60){
			System.out.println("CD");
		}
		if(m>=61 && m<=70){
			System.out.println("BC");
		}
		if(m>=71 && m<=80){
			System.out.println("BB");
		}
		if(m>=81 && m<=80){
			System.out.println("AB");
		}
		if(m>=91 && m<=100){
			System.out.println("AA");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 6;
		int total = 0;
		int nums=n;
		while(n>0){
		   int m=sc.nextInt();
		    total+=m;	
		    n--;
		}
		int avg=total/nums;
		gradeIs(avg);
	}
}


