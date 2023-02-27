package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// atribuição por valor
		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println(a);
		System.out.println(b);

		// atribuição por referencia (objeto)
		// se voce altera o valor em um objeto,
		// ele sera alterado no outro também
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		d1.dia = 31;
		d1.mes = 12;
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	// metodos staticos so conseguem acessar metodos staticos
	static  void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	
	}

}
