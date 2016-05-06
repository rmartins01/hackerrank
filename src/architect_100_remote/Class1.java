package architect_100_remote;

public class Class1 {
	
	private static int first(int a, int b){
		if(b==0){
			return a;
		}else{
			return second(b, a-b);
		}
	}
	private static int second(int a, int b){
		if(a==0){
			return b;
		}else{
			return first(b, a);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(first(5, 3));
	}
}
