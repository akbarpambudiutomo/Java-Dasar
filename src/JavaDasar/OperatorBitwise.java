package JavaDasar;

/** @author Akbar Pambudi Utomo Feb 24, 2023	2:49:59 PM **/

public class OperatorBitwise {
	
	public static void main(String [] args) {
		//Operator Bitwise --> operator untuk melakukan operasi pada nilai bit
		
		byte a = 3;
		byte b,c;
		String a_bits, b_bits, c_bits;
		
		
		// Operator Shift left
		System.out.println("====== SHIFT LEFT");
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte) (a << 2);
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.printf("%s = %d \n", b_bits,b);

		// Operator Shift left
		System.out.println("====== SHIFT RIGTH");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte) (a >> 2);
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.printf("%s = %d \n", b_bits,b);
		
		// Operator bitwise OR
		System.out.println("====== Bitwise OR (|)");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.printf("%s = %d \n", b_bits,b);
		c = (byte)(a | b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.printf("%s = %d \n", c_bits,c);
		
		// Operator bitwise AND
		System.out.println("====== Bitwise OR (&)");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.printf("%s = %d \n", b_bits,b);
		c = (byte)(a & b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.printf("%s = %d \n", c_bits,c);
		
		// Operator bitwise XOR
		System.out.println("====== Bitwise XOR (^)");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
		System.out.printf("%s = %d \n", b_bits,b);
		c = (byte)(a & b);
		c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
		System.out.printf("%s = %d \n", c_bits,c);
		
		// Operator bitwise NOT
		System.out.println("====== Bitwise NOT (~)");
		a = 24;
		b = (byte) (~a);
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("%s = %d \n", a_bits,a);
		b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
		System.out.printf("%s = %d \n", b_bits,b);
		
		
	}

}
