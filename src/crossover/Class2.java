package crossover;

public class Class2 {
	static int x;
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
					
					teste();
				}
			}.start();
		}
		
		System.out.println(x);
	}
	
	static void teste(){
		for (int i = 0; i < 10000000; i++) {
			x = x+1;
		}
	}
}
