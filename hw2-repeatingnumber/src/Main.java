
public class Main {

	public static void main(String[] args) {
		int[] dizi = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 9};
		int[] yenidizi=new int[dizi.length];
		 
		for (int i=0; i<dizi.length; i++)
		{
			yenidizi[dizi[i]-1]++;
			
			if (yenidizi[dizi[i]-1] > 1)
				dizi[i]=0;
		}
		 
		for (int i=0; i<dizi.length; i++)
		{
			if (dizi[i] != 0)
				System.out.print(dizi[i]+" ");
		}

	}

}
