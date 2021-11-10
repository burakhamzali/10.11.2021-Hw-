import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int kolonsayisi = 6; //
		int kolon[][] = new int[6][6];

		for (int i = 0; i < kolonsayisi; i++) {
			for (int j = 0; j < 6; j++) {
				Random rnd = new Random();
				int sayi = 1 + rnd.nextInt(49);
				if (sayi != kolon[i][j]) { // Aynı kolondaki sayılar farklı olmalı.
					kolon[i][j] = sayi;
				}
			}
		}
		System.out.println("Oynanan Kolonlar:");

		for (int i = 0; i < kolonsayisi; i++) {
			System.out.println("");

			for (int j = 0; j < 6; j++) {

				System.out.print(kolon[i][j] + "  ");

			}
		}
	}

}
