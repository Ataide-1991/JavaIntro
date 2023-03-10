package Desafio2;


public class ContaCorrente2 {
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	

	
	public ContaCorrente2(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}
	
	public ContaCorrente2() {
	}
	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
	public boolean saque(double sacar) {
		if (getSaldo() >= sacar) {
			saldo -= sacar;
			confirmaSaque();
			return true;
		} else {
			if (isEspecial()) {
				double limiteDisponivel = getLimiteEspecial() + saldo;
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
	
	public void confirmaSaque() {
		System.out.println("Saque efetuado");
	}
	
	public void negaSaque() {
		System.out.println("Saldo insuficiente");
	}

	public boolean depositar (double valorDepositado) {
		if (valorDepositado > 0) {
			saldo += valorDepositado;
			confirmaDeposito();
			return true;
		} else {
			negaDeposito();
			return false;
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Saldo atual: " + getSaldo());
	}
	
	public void confirmaDeposito() {
		System.out.println("Deposito feito, saldo atual: " + getSaldo());
	}
	
	public void negaDeposito() {
		System.out.println("Deposito negado, valor negativo ou zerado, saldo atual: " + getSaldo());
	}
	
	public boolean verifyChequeEspecial() {
		if (saldo < 0) {
			System.out.println("Cheque especial: Sim");
			return true;
		} else {
			System.out.println("Cheque especial: Não");
			return false;
		}	
	}
	
	public void exibeDadosCliente() {
		System.out.println("Dados do cliente:");
		System.out.println("Conta: " +getNumero());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Cliente especial: " + isEspecial());
		System.out.println("Saldo de limite especial: " + getLimiteEspecial());
		System.out.println("Saldo da conta: " + getSaldo());
	}
}
