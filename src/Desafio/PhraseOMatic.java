package Desafio;

public class PhraseOMatic {

	public static void main(String[] args) {
		String [] wordListOne = {"24/7", "varias camadas",
				"30.000 pés", "B-to-B", "todos ganham", "front-end", "baseado na web",
				"difundido", "inteligente", "seis sigma", "caminho crítico", "dinamico"};
		
		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado",
				"central", "distribuído", "agrupado", "solidificado", "independente da maquina",
				"posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
				"compartilhado", "cooperativo", "acelerado"};
		
		String[] wordListThree = {"proceso", "ponto maximo", "solução", "arquitetura",
				"habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço",
				"visão", "paradigma", "missão"};
		
		// ver quantas palavras existem em cada variável
		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		// gerar tres numeros aleatórios
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLenght);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] ;
		System.out.println(phrase);
	}

}
