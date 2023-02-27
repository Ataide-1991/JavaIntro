package comeco;

public class inicio {
	public static void main(String[] args) {
		System.out.println("Hello world");
		int x = 3;
		int z = 0;
		String name = "dirk";
		x = x * 17;
		
		System.out.println(name);
		System.out.println("x is: " + x);
		
		double d = Math.random();
		System.out.println("d is: " + d);
		
		//loops for e while
		while( z < 12) {
			z = z + 1;
			System.out.println("z is: " + z);
		}
		
		for (int y = 0; y < 10; y++) {
			System.out.println("y is: " + y);
		}
		
		if (z == 10) {
			System.out.println("z é igual a: " + z);
		}else {
			System.out.println("z ainda não é 10");
		}
	}

}
