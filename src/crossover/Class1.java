package crossover;

public class Class1 {

	public static void main(String[] args) {
		int[] i ={1};
		Class1 in = new Class1();
		in.increment(i);
		System.out.println(i[i.length-1]);
	}
	
	void increment (int[] i){
		i[i.length-1]++;
	}
}
