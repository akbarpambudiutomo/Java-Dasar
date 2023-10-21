package JavaDasar;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		Scanner inputName = new Scanner(System.in);
		
		System.out.print("Input Nama: ");
		input = inputName.next();
		
		// ekspresinya berupa satuan (int, long, byte, short), String, atau enum!
		
		switch(input) {
			case "akbar":
				System.out.println("Hadir nama saya Akbar!");
				break;
			case "pambudi":
				System.out.println("Hadir nama saya Pambudi");
				break;
			default:
				System.out.println(input + " Tidak hadir!");
		}
	}

}
