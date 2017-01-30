package mercadolivre;

public class TestRaizQuadradaPerfeita {

	public static void main(String[] args) {
		
		System.out.println(isQuadradoPerfeito(10));
	}

	private static boolean isQuadradoPerfeito(int num) {
		double num2 = Math.sqrt(num);
		
		if(num == Math.pow(num2, 2)){
			return true;
		}else{
			return false;
		}
	}

}
