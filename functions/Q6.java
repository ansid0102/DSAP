// print circumference and area of circle
import java.util.*;
public class Q6{
	public static void printCir(double r){
		System.out.println("Circumference is " + (2*3.14*r));
		System.out.println("Area is " + (3.14*r*r));
	}
	public static void main(String args[]){
		double r = Double.parseDouble(args[0]);
		printCir(r);
	}
}
