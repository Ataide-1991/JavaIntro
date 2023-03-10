package Desafio2;

public class ContaCorrente2Teste {

	public static void main(String[] args) {
		ContaCorrente2 conta = new ContaCorrente2(); //Construtor "vazio"
		conta.setNumero("54321");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(1000);
		conta.setSaldo(0);
		
		conta.saque(900);
		conta.exibirSaldo();
		conta.saque(900); 
		conta.exibirSaldo();
		conta.depositar(500);
		conta.exibirSaldo();
		conta.depositar(-1);
		conta.exibirSaldo();
//		conta.saque("900"); Por ser tipado, já acusa que esta inserindo parametro errado.
		conta.verifyChequeEspecial();
		conta.exibeDadosCliente();
		System.out.println();
		
		
		ContaCorrente2 conta2 = new ContaCorrente2("12345", "4321", false, 500, 500);
		conta2.exibeDadosCliente();

	}

}
