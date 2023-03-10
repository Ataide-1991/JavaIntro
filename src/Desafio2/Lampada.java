package Desafio2;

public class Lampada {
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;

	// Construtor (vazio e com atributos
	public Lampada() {
		
	}
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String [] tipos, boolean tipoAbajur, boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}
	

	// getters e setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipuLuz() {
		return tipoLuz;
	}

	public void setTipuLuz(String tipuLuz) {
		this.tipoLuz = tipuLuz;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	
	//metodos (utilizando setters)
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void alterarEstado() {
		if (isLigada()) {
			setLigada(false);
		} else {
			setLigada(true);
		}
	}
	
	//metodo exibir (utilizando getter isLigada)
	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lâmpada está desligada");
		}
	}
}
