package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	// valores padrões ao inicializar a variável, fora dos metodos/construtor
	// quando for constante (final), deve inicializar com o valor desejado
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '/u0000'
	// objetos tem -> null  (String s)
	
	// 2 construtores feito, um com parametro
	Data(int dia, int mes,
			int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// e um com valores padrões
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1,1,1970);  //chamando o outro metodo da classe com this
		// somente dentro de um construtor
	}
	
	String dataFormatada () {
//		return dia +"/"+mes+"/"+ano;
		String formato = "%d/%d/%d";
		return String.format(formato,this.dia,mes,ano) ;
	}
	
	
	// metodos estaticos não podem ter this
	// pois são metodos da classe, não da instância
//	static void teste() {
//		this.dia;
//	}
}
