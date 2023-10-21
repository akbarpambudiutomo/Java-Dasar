package JavaDasar;

/** @author Akbar Pambudi Utomo Feb 22, 2023	11:26:10 AM **/

public class OperatorAritmatika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1=5;
		int var2=9;
		int hasil;
		
		//penjumlahan
		hasil = var1 + var2;
		System.out.println(var1 + " + " + var2 + " = " + hasil);
		
		//pengurangan
		hasil = var1 - var2;
		System.out.printf("%d - %d = %d \n", var1, var2, hasil);
		
		//perkalian
		hasil = var1 * var2;
		System.out.printf("%d x %d = %d \n", var1, var2, hasil);
		
		//pembagian
		hasil = var1 / var2;
		System.out.printf("%d / %d = %d \n", var1, var2, hasil);
		
		float a = 13;
		float b = 3;
		float hasilFloat = a/b;
		System.out.println(a + " / " + b + " = " + hasilFloat);
		
		//modulus
		hasil = var1 % var2;
		System.out.printf("%s %% %s = %s \n",var1,var2,hasil);
		
		
	}

}
