package br.com.dz.useacabeca;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		// crie três conjuntos de palavras onde será feita a seleção
		
		String [] wordListOne = {"24/07", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end","baseado na web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico"};
		String [] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distibuído", "agrupado", "solidificado", "independente de máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
		String [] wordListThree = {"processo","ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};
		
		// descubra quantas palavras existem em cada linha
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// gere 3 número aleatórios
		
		int rand1 = (int) (Math.random()* oneLength);
		int rand2 = (int) (Math.random()* twoLength);
		int rand3 = (int) (Math.random()* threeLength);
	
		// agora construa uma frase
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; 
		
		// exiba a frase
		
		System.out.println(" Precisamos de " + phrase);
	}
}
