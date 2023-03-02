package Desafio;

public class testes {
	// Carro
	String name;
	String brand;
	String model;
	String color;
	double fuelCapacity;

	boolean engine = false;

	// criando construtor vazio
	testes() {
		
	}

	// criando construtor com atributos
	testes(String name, String brand, String model, String color, double fuelCapacity) {
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.fuelCapacity = fuelCapacity;

	}

	// getters e setters para os atributos da instância (objeto)
	// quando tipado, retorna seu valor
	String getName() {
		return name;
	}

	// quando void (sem retorno), seta seu valor
	void setName(String name) {
		this.name = name;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getFuelCapacity() {
		return fuelCapacity;
	}

	void setFuelCapacity(double capacity) {
		this.fuelCapacity = capacity;
	}

	boolean getEngine() {
		return engine;
	}
	
	void setEngine(boolean engine) {
		this.engine = engine;
	}



	// métodos sem retorno, so para exibir algo (ou setar valor, como nos setters)
	void turnOnEngine() {
		if (!engine) {
			System.out.println("Starting engine!, vrum vrum...");
			engine = true;
		} else {
			System.out.println("Engine is already on!");
		}
	}

	void turnOffEngine() {
		if (!engine) {
			System.out.println("Engine is already off");
		} else {
			System.out.println("Engine turn off!");
			engine = false;
		}
	}

	void verifyEngine() {
		if (engine) {
			System.out.println("Engine is on");
		} else {
			System.out.println("Engine is off");
		}
	}

	// método para exibir todas os dados do objeto instanciado
	String seeAllDataObj() {
		return getName() + "\n" + getBrand() + "\n" + getModel() + "\n"
	+ getColor() + "\n" + getFuelCapacity();
	}

	// exemplo de overload de métodos (com parâmetros)
	double fuelCar(double literValue) {
		return fuelCapacity * literValue;
	}

	double fuelCar(double literValue, boolean payCardCredit) {
		return fuelCapacity * literValue;
	}

	// testando a classe (no mesmo arquivo, somente para fins de testes)
	// normalmente se separa em arquivo 'classe' e arquivo 'teste'
	public static void main(String[] args) {
		testes Carro = new testes();
		Carro.name = "fiat";
		System.out.println("Nome do carro: " + Carro.name);
		Carro.verifyEngine();
		Carro.turnOnEngine();
		Carro.verifyEngine();
		Carro.turnOnEngine();
		Carro.verifyEngine();
		Carro.turnOffEngine();
		Carro.verifyEngine();
		Carro.turnOffEngine();
		Carro.verifyEngine();
		System.out.println(Carro.seeAllDataObj());
		
		System.out.println();

		testes Carro2 = new testes("Gol", "VolksWagen", "bola", "azul", 50);
		System.out.println(Carro2.seeAllDataObj());

	}
}