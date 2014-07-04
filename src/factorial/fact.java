package factorial;

public class fact {

	public static int factorial(int num){
		if(num == 0){
			return num;
		}
		else if(num == 1){
			return num;
		}
		else{
			return num*factorial(num-1);
		}
	}
	
	public static void print(int arg){
		System.out.println(arg);
	}
	public static void main(String[] arguments){
		print(factorial(-8));
	}
}
