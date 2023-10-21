package JavaDasar;

/** @author Akbar Pambudi Utomo Feb 24, 2023	11:40:28 AM **/

public class OperatorKomparasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		boolean hasilKomparasi;
		
		System.out.println("------ PERSAMAAN");
		a = 10;
		b = 10;
		hasilKomparasi = (a == b);
		System.out.printf("%d == %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a == b);
		System.out.printf("%d == %d --> %s \n", a,b, hasilKomparasi);
		
		System.out.println("------ PERTIDAKSAMAAN");
		a = 10;
		b = 10;
		hasilKomparasi = (a != b);
		System.out.printf("%d != %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a != b);
		System.out.printf("%d != %d --> %s \n", a,b, hasilKomparasi);
		
		System.out.println("------ KURANG DARI");
		a = 10;
		b = 10;
		hasilKomparasi = (a < b);
		System.out.printf("%d < %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a < b);
		System.out.printf("%d < %d --> %s \n", a,b, hasilKomparasi);
		
		System.out.println("------ LEBIH DARI");
		a = 10;
		b = 10;
		hasilKomparasi = (a > b);
		System.out.printf("%d > %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a > b);
		System.out.printf("%d > %d --> %s \n", a,b, hasilKomparasi);
		
		System.out.println("------ KURANG DARI SAMA DENGAN");
		a = 11;
		b = 10;
		hasilKomparasi = (a <= b);
		System.out.printf("%d <= %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a <= b);
		System.out.printf("%d <= %d --> %s \n", a,b, hasilKomparasi);
		
		System.out.println("------ LEBIH DARI SAMA DENGAN");
		a = 10;
		b = 10;
		hasilKomparasi = (a >= b);
		System.out.printf("%d >= %d --> %s \n", a,b, hasilKomparasi);
		
		a = 10;
		b = 11;
		hasilKomparasi = (a >= b);
		System.out.printf("%d >= %d --> %s \n", a,b, hasilKomparasi);

	}

}
