package br.com.dz.useacabeca;

public class BeerSong {

	public static void main(String[] args) {

		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {

			if (beerNum == 1) {
				word = "bottles"; // no singular, como em UMA garafa.
			}
			System.out.println(beerNum + " " + word + "of beer on the wall");
			System.out.println(beerNum + " " + word + "of beer.");
			System.out.println("Take on down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + "of beer on the wall");
			} else {
				System.out.println("No more bottles od beer on the wall.");
			} // fim do else
		} // fim do loop
	}// fim do método main
}// fim da classe