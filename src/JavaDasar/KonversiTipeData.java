package JavaDasar;
/** @author Akbar Pambudi Utomo Feb 22, 2023	11:43:52 AM **/

public class KonversiTipeData {

	public static void main(String[] args) {
		// Konversi data
		int nilaiInt = 200;
		System.out.println("nilai integer = " + nilaiInt);
		// memperbesar rentang ke type data lebih besar
		long nilaiLong = nilaiInt;
		System.out.println("nilai Long = " + nilaiLong);
		//memperkecil rentang ke type data kecil
		byte nilaiByte = (byte)nilaiInt;
		System.out.println("nilai byte = " + nilaiByte);
		System.out.println("nilai max byte = " + Byte.MAX_VALUE);
		
		// casting pembagian
		int a = 10;
		int b = 3;
		
		float c = (float) a/b;
		System.out.printf("%d / %d = %f \n",a,b,c);
		

	}

}
