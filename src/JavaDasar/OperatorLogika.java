package JavaDasar;

/** @author Akbar Pambudi Utomo Feb 24, 2023	2:22:18 PM **/

public class OperatorLogika {

	public static void main(String[] args) {
		// Operator Logika --> Operasi yang bisa kita lakukan kepada tipe data boolean
		// AND, OR, XOR, negasi
		
		boolean a,b,c;
		
		// OR (||)
		System.out.println("===== OR (||) =====");
		a = false;
		b = false;
		c = (a||b);
		System.out.println(a + " || " + b + " = " + c);
		a = false;
		b = true;
		c = (a||b);
		System.out.println(a + " || " + b + " = " + c);
		a = true;
		b = false;
		c = (a||b);
		System.out.println(a + " || " + b + " = " + c);
		a = true;
		b = true;
		c = (a||b);
		System.out.println(a + " || " + b + " = " + c);
		
		// AND (&&)
		System.out.println("===== AND (&&) =====");
		a = false;
		b = false;
		c = (a&&b);
		System.out.println(a + " && " + b + " = " + c);
		a = false;
		b = true;
		c = (a&&b);
		System.out.println(a + " && " + b + " = " + c);
		a = true;
		b = false;
		c = (a&&b);
		System.out.println(a + " && " + b + " = " + c);
		a = true;
		b = true;
		c = (a&&b);
		System.out.println(a + " && " + b + " = " + c);
		
		// XOR (^)
		System.out.println("===== XOR (^) =====");
		a = false;
		b = false;
		c = (a^b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = false;
		b = true;
		c = (a^b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = true;
		b = false;
		c = (a^b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = true;
		b = true;
		c = (a^b);
		System.out.println(a + " ^ " + b + " = " + c);
		
		//NOT / negasi (!)
		System.out.println("===== NOT (!) =====");
		a = true;
		c = !a;
		System.out.println(a + " --> (!) = " + c);
		
		a = false;
		c = !a;
		System.out.println(a + " --> (!) = " + c);
		
		

	}

}
