
public class Main {

	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4, 5, 6, 7 , 8, 9};
		int temp = 0;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 1; j < (dizi.length - i); j++) {

				if (dizi[j - 1] < dizi[j]) {

					temp = dizi[j - 1];
					dizi[j - 1] = dizi[j];
					dizi[j] = temp;
				}

			}
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
	}

}
