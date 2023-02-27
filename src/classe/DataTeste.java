package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(21,12, 2023);
//		d1.dia = 21;
//		d1.mes = 12;
//		d1.ano = 2019;
		
		System.out.println("Data: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
//		System.out.printf("%d/%d/%d",d1.dia, d1.mes, d1.ano);
		System.out.println(d1.dataFormatada());
		
		Data teste = new Data();
		System.out.println(teste.dataFormatada());
	}

}
