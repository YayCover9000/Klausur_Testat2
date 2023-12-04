import java.util.Scanner;
public class Klausur_Testat2_Testtreiber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		
		int min = 0;
		int max1 = 10;
		int max2 = 100;
		int range1 = max1 - min + 1;
		int range2 = max2 - min + 1;
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random() * range1) + min;
			array2[i] = (int)(Math.random() * range2) + min;
		}
		
		
		Klausur_Testat2.ausgeben(array1, array2); 
		
	}
}
