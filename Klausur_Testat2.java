
public class Klausur_Testat2 {
	public static void ausgeben(int[] array1, int[] array2) {
		int cnt = 0;
		int sum = 0;
		if(array1 != null && array2 != null) {
			
			for(int i= 0; i < array1.length; i++) {
				if((array1[i] + array2[i]) > 49 ) {
					sum = array1[i] + array2[i];
					cnt +=1;
					System.out.println("Array1: " + array1[i] + " Array2: " + array2[i] + " sind gleich " + sum);
					// System.out.println("Array1: " + array1[i] + " Array2: " + array2[i] + " sind gleich " + array1[i] + array2[i]); // elementweise Addition
				}
			}
			System.out.println("Es haben " + cnt + " Teilnehmer bestanden.");
		}
		
		
	}
}
