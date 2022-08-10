// find if a number is prime or not 
public class Q7{
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		System.out.println(isPrime(n));
	}
}
