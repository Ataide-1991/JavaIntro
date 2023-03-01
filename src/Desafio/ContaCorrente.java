package Desafio;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	
	boolean saque(double sacar) {
		if (saldo >= sacar) {
			saldo -= sacar;
			confirmaSaque();
			return true;
		} else {
			if (especial) {
				double limiteDisponivel = limiteEspecial + saldo;
				if (limiteDisponivel >= sacar) {
					saldo -= sacar;
					confirmaSaque();
					return true;
				} else {
					negaSaque();
					return false;
				}
			} else {
				negaSaque();
				return false;
			}
		}
	}
	
	void confirmaSaque() {
		System.out.println("Saque efetuado");
	}
	
	void negaSaque() {
		System.out.println("Saldo insuficiente");
	}

	boolean depositar (double valorDepositado) {
		if (valorDepositado > 0) {
			saldo += valorDepositado;
			confirmaDeposito();
			return true;
		} else {
			negaDeposito();
			return false;
		}
	}
	
	void exibirSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}
	
	void confirmaDeposito() {
		System.out.println("Deposito feito, saldo atual: " + saldo);
	}
	
	void negaDeposito() {
		System.out.println("Deposito negado, valor negativo ou zerado, saldo atual: " + saldo);
	}
	
	boolean verifyChequeEspecial() {
		if (saldo < 0) {
			System.out.println("Cheque especial: Sim");
			return true;
		} else {
			System.out.println("Cheque especial: Não");
			return false;
		}
		
	}
}
