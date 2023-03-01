package Desafio;

public class ContaCorrenteTeste {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "54321";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 1000;
		conta.saldo = 0;
		
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
	}

}
