package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		// caso queira alterar o valor de uma instancia
		// acessar diretamente a classe
		// Obs.: se tiver final static, não sera possível alterar
//		AreaCirc.pi = 3.1415;
		
		
		AreaCirc a1 = new AreaCirc(5.6);
		
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi = 6;
		
		System.out.println(a2.area());
		System.out.println(AreaCirc.area(100));

	}

}
