package LatihanProgramJava;

import java.util.*;

public class KalkulatorSederhana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputUser;
		float a,b,hasil;
		char operator;
		
		inputUser = new Scanner(System.in);
		
		System.out.print("nilai a = ");
		a = inputUser.nextFloat();
		System.out.print("operator = ");
		operator = inputUser.next().charAt(0);
		System.out.print("nilai b = ");
		b = inputUser.nextFloat();
		
		System.out.println("input user: " + a + " " + operator + " " + b);
		
		//operator yang digunakan + - * /
		
		if (operator == '+') {
			//penjumlahan
			hasil = a + b;
			System.out.println("hasilnya: " + hasil);
		} else if ( operator == '-') {
			//pengurangan
			hasil = a - b;
			System.out.println("hasilnya: " + hasil);
		} else if ( operator == '*') {
			//perkalian
			hasil = a * b;
			System.out.println("hasilnya: " + hasil);			
		} else if (operator == '/') {
			//pembagian
			if (b == 0) {
				System.out.println("pembagi nol = nilai tak terhingga");
			} else {
				hasil = a / b;
				System.out.println("hasilnya: " + hasil);
			}
		} else {
			System.out.println("operator tidak ditemukan!");
		}

	}

}
