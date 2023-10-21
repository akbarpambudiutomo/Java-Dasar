package JavaDasar;

import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input, x;
		
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("masukkan nilai: ");
		input = inputUser.nextInt();
		
		// variable x = ekspresi ? statement_true : statement_false;
		
		x = (input == 10) ? (input*input) : (input/2);
		
//		// Jika menggunakan if else
//		if (input == 10) {
//			x = input*input;
//		} else {
//			x = input/2;
//		}
		
		System.out.println("hasilnya: " + x);

	}

}
