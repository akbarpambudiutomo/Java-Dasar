package JavaDasar;

import java.util.Scanner;

/** @author Akbar Pambudi Utomo Feb 24, 2023	3:55:42 PM **/

public class LatihanAritmatika {
	
	public static void main(String [] args) {
		
		//Program luas persegi panjang
		Scanner userInput = new Scanner(System.in);
		int panjang, lebar, luas, tinggi, volume;
		
		
		System.out.println("MENGHITUNG LUAS");
		System.out.print("Panjang = ");
		panjang = userInput.nextInt();
		System.out.print("Lebar = ");
		lebar = userInput.nextInt();
		
		luas = panjang * lebar;
		System.out.println("Luas = " + luas);
		
		System.out.println("MENGHITUNG VOLUME");
		System.out.print("tinggi = ");
		tinggi = userInput.nextInt();
		volume = luas*tinggi;
		System.out.println("Volume = " + volume);
		
		
		
	}

}
