package classe;

public class AreaCirc {
	double raio;
	
	// com static voce informa que possui valor padrão
	// com final, voce força o valor a ficar inalteravel
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
//		pi = 3.14;
		raio = raioInicial;
		
	}
	
	double area() {
//		return raio * raio * pi;
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
