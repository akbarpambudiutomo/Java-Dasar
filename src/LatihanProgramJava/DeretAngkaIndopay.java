/**
 * 
 */
package LatihanProgramJava;

/**
 * @author
 *  Akbar Pambudi Utomo May 31, 2023 2:14:45 PM
 */
public class DeretAngkaIndopay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Indopay");
			} else if (i % 3 == 0) {
				System.out.println("Indo");
			} else if (i % 5 == 0 ) {
				System.out.println("pay");
			} else {
				System.out.println(i);
			}
		}
	}
	
	//Program di atas menggunakan loop 'for' untuk 
	//mengiterasi angka dari 1 hingga 100. Pada setiap iterasi, 
	//program memeriksa kondisi apakah angka tersebut habis dibagi 
	//3 dan/atau 5 menggunakan operator modulo (%). Jika angka habis 
	//dibagi 3, program akan mencetak "Indopay". Jika angka habis dibagi 5,
	//program akan mencetak "Indo". Jika angka habis dibagi 3 dan 5, 
	//program akan mencetak "pay". Jika tidak memenuhi kondisi 
	//tersebut, program akan mencetak angka itu sendiri.

}
