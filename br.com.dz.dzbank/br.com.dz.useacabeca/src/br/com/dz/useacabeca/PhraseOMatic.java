package br.com.dz.useacabeca;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		// crie tr�s conjuntos de palavras onde ser� feita a sele��o
		
		String [] wordListOne = {"24/07", "v�rias camadas", "30.000 p�s", "B-to-B", "todos ganham", "front-end","baseado na web", "difundido", "inteligente", "seis sigma", "caminho cr�tico", "din�mico"};
		String [] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distibu�do", "agrupado", "solidificado", "independente de m�quina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
		String [] wordListThree = {"processo","ponto m�ximo", "solu��o", "arquitetura", "habilita��o no n�cleo", "estrat�gia", "mindshare", "portal", "espa�o", "vis�o", "paradigma", "miss�o"};
		
		// descubra quantas palavras existem em cada linha
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// gere 3 n�mero aleat�rios
		
		int rand1 = (int) (Math.random()* oneLength);
		int rand2 = (int) (Math.random()* twoLength);
		int rand3 = (int) (Math.random()* threeLength);
	
		// agora construa uma frase
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; 
		
		// exiba a frase
		
		System.out.println(" Precisamos de " + phrase);
	}
}
